import java.util.*;
class keypad{
    public static void main(String[] args) {
        String s1="pwwkew";
        StringBuilder sb= new StringBuilder(s1);
        
        int i=0;
        int j=1;
        while(j<sb.length()){
            
            if(sb.charAt(i)==sb.charAt(j)){
                sb.delete(i-1, i+1);
                i++;
                j++;

            }
            i++;
            j++;
            
        }
        System.out.print(sb.length());
        
        


    }
}