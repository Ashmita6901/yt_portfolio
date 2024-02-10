class calci{
    int n1;
    int n2;
    public void sum(int n1 , int n2){
        System.out.println(n1+n2);

    }
    public void sum(double n1 , int n2){
        System.out.println(n2-n1);
    }
    
       
    }
   public class Polymorphism {
    public static void main(String[] args) {
        calci c1= new calci();
        c1.sum(5,5);
        c1.sum(5.0,30);
        
        
    }
}
