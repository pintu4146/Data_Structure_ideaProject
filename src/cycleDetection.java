import java.util.Scanner;

public class cycleDetection {
    public  static  void main(String[] args)
    {
        node head=null;

        head=insertAtbeg(head,10);
        head=insertAtbeg(head,20);
        head=insertAtbeg(head,30);
//        head=insertAtbeg(head,40);
//        head=insertAtbeg(head,50);
//        head=insertAtbeg(head,60);
//        head=insertAtbeg(head,70);
//        head=insertAtbeg(head,80);
//        head=insertAtbeg(head,90);
//        head=insertAtbeg(head,100);
        head.next=head;
         boolean res=cycDitection(head);
     System.out.println(res);

    }

    private static boolean cycDitection(node head) {
         System.out.println("different method" +
                 "m1)O(n^2)");


        boolean flag=false;


                 node curr=head.next,curr1=head;
                 while(curr != null)
                 {
                     while(curr1 !=curr)
                     {


                         if(curr1==curr) {
                             flag = true;
                             break;
                         }
                         curr1=curr1.next;
                         if(flag==true)
                             break;
                     }curr1=head;
                     curr=curr.next;

                 }
                 System.out.println(flag);


        return flag;

    }

    private static node insertAtbeg(node head, int data) {
        node temp=new node(data);
        if(head==null) return temp;
        temp.next=head;
        return temp;
    }
}
