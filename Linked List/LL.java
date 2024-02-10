class LL{
    //creation of node 
    Node head;
    class Node{
        String data;
        Node next;


        Node(String data){
            this.data= data;
            this.next=null;
        }
    }
   
    

//Add node at first place
public void addFirst(String data){
    Node newNode= new Node(data);
    if(head==null){
        head= newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}
//Add node at Last place
public void addLast(String data){
    Node newNode= new Node(data);
    if(head==null){
        head= newNode;
        return;

    }
    Node currNode = head;
    while(currNode.next != null){
        currNode= currNode.next;        
    }
    currNode.next= newNode;

}
//Add node in between thw two node
public void addBetween(int pos, String data){
    Node temp= head;
    int count=1;
    // if(head==null){
    //     head=temp;
    //     return;
    // }
    while(count< pos-1){
        temp= temp.next;
        count++;

    }
    Node newNode = new Node(data);
    newNode.next= temp.next;
    temp.next= newNode;

}
//Printting LL
public void printList(){
    if(head==null){
        System.out.println("List is empty");
        return;

    }
    Node currNode = head;
    while(currNode != null){
        System.out.print(currNode.data + " = >");
        currNode= currNode.next;        
    }
    System.out.print("Null");

}
    public static void main(String[] args) {
        LL list= new LL();
        list.addFirst("a");
        list.addFirst("is");
        
        list.addLast("Linked");
        list.addLast("List");
        list.addFirst("This");
        
        list.printList();
        System.out.println();
        list.addBetween(4,"Modified");
        list.printList();

    }
    
}
