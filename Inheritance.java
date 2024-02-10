class shape{
    int l;
    int h;
    // int r;
    public void msg(){
        System.out.println("displays area");
    }
}
//SINGLE INHERITANCE

class triangle extends shape{
    public void area(int l , int h){
        System.out.println(0.5 * l * h);
    }

}
//DOUBLE INHERITANCE
class equilateral extends triangle{
    public void area(){
        System.out.println("same as triangle");
    }
}
//Hierarichal inheritance
class circle extends shape{
    public void area(int r){
        System.out.println((3.14) *r*r);
    }

}
//this is interheritance





public class Inheritance {
    public static void main(String[] args) {
        shape Shape = new shape();
        triangle t1= new triangle();
        equilateral t2= new equilateral();
        circle c1= new circle();
        Shape.msg();
        t1.area(2,3);
        t2.area();
        c1.area(5);

        
    }
}
