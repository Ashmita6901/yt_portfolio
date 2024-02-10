public class DeleteLL {
    Node head;
    private int size;
    DeleteLL(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;
        //creating new node
        Node(int data){
            this.data = data;
            this.next= null;
            size++;
        }
    }
    public void addFirst(int data){
        Node newnode= new Node(data);
        if(head==null){
            head= newnode;
            return;
        }
        newnode.next = head;
        head= newnode;
    }
    //DELETE AT FRONT
    public void deleteFirst(){
        if(head== null){
            System.out.println("Nothing to Delete");
            return;
        }
        size--;
        head= head.next;


    }
    //DELETE AT LAST
    public void deleteLast(){
        if(head== null){
            System.out.println("Nothing to Delete");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
        }
        Node seconlast= head;
        Node last= head.next;
        while(last.next!= null){
            last=last.next;
            seconlast= seconlast.next;


        }
        seconlast.next= null;

    }
    //size of linkedlist
    public int getsize(){
        return size;
    }
    public void print(){
        Node currnode= head;
        while(currnode != null){
            System.out.print(currnode.data + "-> ");
            currnode= currnode.next;
        }
        System.out.print("NUll");
    }
    public static void main(String[] args) {
        DeleteLL Del= new DeleteLL();
        Del.addFirst(5);
        Del.addFirst(4);
        Del.addFirst(3);
        Del.addFirst(2);
        Del.addFirst(1);
        Del.addFirst(0);
        Del.print();
        Del.deleteFirst();
        System.out.println();
        Del.print();
        System.out.println();
        Del.deleteLast();
        Del.print();
        System.out.println();
        System.out.println(Del.getsize());
        Del.addFirst(20);
        System.out.println();
        System.out.println(Del.getsize());
        


    }
}
    

