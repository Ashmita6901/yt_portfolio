import java.util.*;
public class framewroksll {
    public static void main(String[] args) {
        LinkedList<Integer> lst= new LinkedList<Integer>();
        lst.addFirst(1);//function to add at the beginning
        lst.addFirst(2);
        lst.addFirst(3);
        lst.addFirst(4);
        lst.addFirst(5);
        lst.addLast(50);//function to add at last
        System.out.println(lst);//to print list
        System.out.println(lst.size()); // to print size
        //traverse and print list
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i)+ " -> ");
            
        }
        System.out.print("Null");
        System.out.println();

        lst.removeFirst(); // delete first eleemnt
        System.out.println(lst);
        lst.removeLast(); // delete last element
        System.out.println(lst);
        

    }
    

    
}
