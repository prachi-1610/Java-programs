package singlylinkedlist;
public class SinglyLinkedList {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    //insertFirst
    public void insertFirst(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    //printing the element
    public void display()
    {
        Node current=head;
        while(current.next!=null)
        {
            System.out.print(current.data+"-->");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ritik");
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.insertFirst(10);
        sll.display();
        System.out.println("ritik");
    }
    
}
