import java.util.*;
class duplicates{
    public static void main(String[] args) {
        String str="pwwkew";
        
        HashSet<Character> set= new HashSet<>();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
            
        }
        System.out.print(sb.toString());
    }
}
