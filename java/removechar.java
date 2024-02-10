import java.util.*;
class removechar{
    public static void main(String[] args) {
        //sliding window method
        String s="bcdebeaec";
        
        String s2="";
        int j=0;
        int i=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            else if(s.charAt(i)!=s.charAt(j)|| j==s.length()-1){
                s2+=s.charAt(i);
                i=j;
                j++;
            }
        }
        s2+=s.charAt(j-1);
        System.out.print(s2);
    }
}

        
        

