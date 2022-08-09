
 class node{
    int data;
    node next;
    boolean visited;
    node(int val)
    {
        data=val;
        next=null;
        visited=false;
    }
}
public class linkedListImplementation {
    public static  void  main(String[] args)
    {
        //***********this is also correct
        /*node head=new node(10);
        node n2=new node(20);
        node n3=new node(30);
        head.next=n2;
        n2.next=n3;
        System.out.println(n3.data);*/
//*****************another way
        node newHead=new node(1);

        node head =new node(10);
        newHead.next=head;
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        printLinkedList(newHead);

    }

    private static void printLinkedList(node head) {
       // node current=head;

        if(head==null) return;
        System.out.println(head.data);
        printLinkedList(head.next);
        System.out.println(head.data);
       // System.out.println(current.data);
//        while (current !=null)
//        {
//            System.out.println(current.data);
//            current=current.next;
//        }
    }
}
