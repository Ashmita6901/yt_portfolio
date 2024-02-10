import java.util.*;
class Min {

    public static void main(String[] args) 
    {
        //pair with 2n difference
        int arr[]= {5, 20, 3, 2, 50, 80,60};
        int n=30;
        int N= n*2;
        int i=0;
        int j=1;
        Arrays.sort(arr);
        while(i<=j && j<=arr.length-1){
            int diff= arr[j]-arr[i];
            if(diff==N && i!=j){
                System.out.println("Pair Found");
                return;
            }
            else if(diff>N){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println("Pair Not Found");
        
    }
    
}

    

