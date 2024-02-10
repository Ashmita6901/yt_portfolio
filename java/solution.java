class AnagramString{
    public static void main(String[] args) {
        //Anagram string
        String s="aacc";
        String t= "caac";
        if(s.length()!=t.length()){
            System.out.print("false");
            return;
        }
        int arr[]=new int[256];
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.println("false");
                return;
            }
            
            
        }
        System.out.print("true");

    }
}