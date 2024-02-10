import java.util.*;

class longestprefix{

    public static void main(String[] args) {
        // int n=32;
        // int d=3;

        int count=0;
        for(int i=431;i<900;i++){
            int rem= i%10;
            int div= i/10;
            if(( rem==7 || div==7)){
                count++;
                // System.out.println(i);
            }
            if(rem==7 && div==7){
                count++;
            }
        }
        System.out.println(count);

       

    }
}
