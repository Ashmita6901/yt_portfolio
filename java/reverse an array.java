import java.util.*;
class array{
    public static void Reverse(int arr[]) {
        int temp=0;
        int i=0;
        int j=arr.length-1;
        
        while(i<j){
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp; 
            i++;
            j--;
        }
       
        
    } 
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            
        }
        System.out.println();
        
    }

}