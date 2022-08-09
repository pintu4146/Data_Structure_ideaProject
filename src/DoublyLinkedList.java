import java.util.Scanner;

class Dnode{
    int data;
    Dnode next;
    Dnode previous;
       Dnode(int val)
       {
           data=val;
           next=null;
           previous=null;
       }
}
public class DoublyLinkedList {
    public static  void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Choice \n 1)simple implementation,traverse from start and end\n" +
                "2)function which insert at begining every time\n" +
                "3) reverse Doubly Linked List");
        int ch=sc.nextInt();
        Dnode head;


        switch (ch)
        {
            case 1:{
                 head=new Dnode(10);
                Dnode head1=new Dnode(20);
                Dnode head2=new Dnode(30);
                head.previous=null;
                head.next=head1;
                head1.previous=head;
                head1.next=head2;
                head2.previous=head1;
                head2.next=null;
                //System.out.println(head1.data);
                Dnode curr=head;
                while (head!=null)
                {
                    System.out.print(head.data+"->");
                    head=head.next;
                }
                System.out.println("null\n");
                while(curr.next !=null)
                {
                    curr=curr.next;
                }
                while(curr !=null)
                {
                    System.out.print(curr.data+"->");
                    curr=curr.previous;
                }
                System.out.println("null\n");
                break;
            }
            case 2:
            {
                 head=null;
                head=insertBeginFun(head,10);
                head=insertBeginFun(head,15);
                head=insertBeginFun(head,20);
                head=insertBeginFun(head,25);
                display(head);

                break;

            }
            case 3 :
            {

                head=null;
                head=insertBeginFun(head,10);
                head=insertBeginFun(head,15);
                head=insertBeginFun(head,20);
                head=insertBeginFun(head,25);
                Dnode res= reverseDll(head);
                display(head);
                  break;
            }
            default:System.out.println("sahi choose krle bhai uper dekh ke ");

        }



    }

    private static Dnode reverseDll(Dnode head) {
        Dnode curr=head,pre=null;
  if(head ==null || head.next ==null) return head;

        while(curr != null)
        {
          pre=curr.previous;
          curr.previous=curr.next;
          curr.next=pre;





           // swapReference(curr.next,curr.previous,head);
           curr=curr.previous;
        }

       return  pre.previous;
    }

    private static void swapReference(Dnode head, Dnode next, Dnode previous) {
        Dnode temp=next;
              next=previous;
              previous=temp;
        if(head.previous!=null)
            System.out.println("ji");
    }

    private static void display(Dnode head) {
        Dnode curr=head;
        while (head!=null)
        {
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("null\n");
        while(curr.next !=null)
        {
            curr=curr.next;
        }
        while(curr !=null)
        {
            System.out.print(curr.data+"->");
            curr=curr.previous;
        }
        System.out.println("null\n");

    }

    private static Dnode insertBeginFun(Dnode head, int data) {
        Dnode temp=new Dnode(data);
        if(head == null) return temp;
        else
        {
            temp.next=head;
            head.previous=temp;
            return  temp;
        }
    }
}
