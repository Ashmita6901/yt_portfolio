import java.util.*;
class pairs{
    public static void main(String[] args) {
        int arr[]={1,1,1,2,3,3,3};
        int temp[]=new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                 temp[j++]=arr[i];
                 i++;
            }
            else{
                temp[j++]=arr[i+1];
                i++;
            }
           
            
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");
        }
    }
}

      