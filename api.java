/**
 * api
 */
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;
import java.util.Map;
public class api {



    public static void main(String[] args) {
        authenticateUser();
    }

    private static void authenticateUser() {
        HttpClient httpClient = HttpClient.newHttpClient();

        // Authentication API endpoint
        String authUrl = "https://qa2.sunbasedata.com/sunbase/portal/api/assignment_auth.jsp";

        // Authentication credentials
        String jsonBody = "{\"login_id\": \"test@sunbasedata.com\", \"password\": \"Test@123\"}";

        HttpRequest authRequest = HttpRequest.newBuilder()
                .uri(URI.create(authUrl))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        try {
            HttpResponse<String> authResponse = httpClient.send(authRequest, HttpResponse.BodyHandlers.ofString());

            // Check if the authentication request was successful (status code 200)
            if (authResponse.statusCode() == 200) {
                // Extract the bearer token from the response
                String bearerToken = extractBearerToken(authResponse);

                // Use the bearer token in subsequent API calls
                String nextApiUrl = "YOUR_NEXT_API_ENDPOINT";
                HttpRequest nextApiRequest = HttpRequest.newBuilder()
                        .uri(URI.create(nextApiUrl))
                        .header("Authorization", "Bearer " + bearerToken)
                        .GET()
                        .build();

                HttpResponse<String> nextApiResponse = httpClient.send(nextApiRequest, HttpResponse.BodyHandlers.ofString());

                // Process the response from the next API call
                System.out.println(nextApiResponse.body());
            } else {
                // Handle authentication error
                System.out.println("Authentication failed with status code " + authResponse.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String extractBearerToken(HttpResponse<String> response) {
        HttpHeaders headers = response.headers();
        Map<String, java.util.List<String>> headerMap = headers.map();

        // Extract the bearer token from the "Authorization" header
        return headerMap.getOrDefault("Authorization", java.util.List.of("")).stream()
                .filter(header -> header.startsWith("Bearer "))
                .findFirst()
                .map(header -> header.substring("Bearer ".length()))
                .orElse("");
    }
}
