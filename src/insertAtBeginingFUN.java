import java.util.Scanner;

class node1{
    int data;
    node1 next;
    node1(int val)
    { data=val;
        next=null; }
}
public class insertAtBeginingFUN {
    public static  void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.insertion at beg\n2. insertion at end");
        int chuj=sc.nextInt();
                switch(chuj){
                    case  1:{
                        node1 head=null;
                        head=insetAtBeg(head,10);
                        head=insetAtBeg(head,20);
                        head=insetAtBeg(head,30);
                        printt(head);
                        break;
                    }
                    case 2:{
                        node1 head=null;
                        head=insetAtEnd(head,10);
                        head=insetAtEnd(head,20);
                        head=insetAtEnd(head,30);
                        head=insetAtEnd(head,40);

                        printt(head);
                     System.out.println("\nhead node will be deleted");
                        head=delHeadNode(head);
                        printt(head);
                        System.out.println("\nhead node will be deleted");
                        head=delLastNode(head);
                        printt(head);
                    }
                }
    }

    private static node1 delLastNode(node1 head) {
        if (head==null) return null;
        if (head.next==null) return  null;
        node1 curr=head;
        while (curr.next.next!=null)
        {
            curr=curr.next;
        }
        curr.next=null;
        return head;

    }

    private static node1 delHeadNode(node1 head) {
        node1 curr=head;
        if(head==null) return null;
        curr=curr.next;
        head=curr;
        return head;

    }

    private static node1 insetAtEnd(node1 head, int i) {

        node1 temp=new node1(i);
        if(head==null) return  temp;
        node1 curr=head;
        while(curr.next !=null)
        {
            curr=curr.next;
        }
        curr.next=temp;
        return head;
//        tail.next=temp;
//        return  tail;

    }

    private static void printt(node1 head) {
        node1 curr=head;
        while(curr !=null)
        {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("null");
    }

    public static node1 insetAtBeg(node1 head, int i) {
        node1 temp=new node1(i);
        temp.next=head;
        return temp;
    }
}
