class pen{
    String color;
    String name;
    public void write(){
        System.out.print("writing with");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;
    public void printname(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public void printage(){
        System.out.println(this.age);
    }
    Student( String Name , int Age){
        this.name= Name;
        this.age= Age;
    }


}
//Polymorphism : perform multiple task with same funcn

public class oops{
    public static void main(String[] args) {
        Student s1= new Student("Aman", 21);//new object created
        //Student() is special function called CONSTRUCTOR
        pen Pen1= new pen();
        Pen1.color="red";
        Pen1.printcolor();
       
        s1.printname();
       
             

        
    }
}