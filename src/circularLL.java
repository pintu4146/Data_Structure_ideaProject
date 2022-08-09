import java.util.Scanner;

public class circularLL {
    public static void main(String[] args)
    {
        node head=new node(10);
        node temp1=new node(20);
        node temp2=new node(30);
        node temp3=new node(40);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=head;
        System.out.println("1)detect using track of visited\n"
                             +"2) floyed's cycle detection\n" +
                "4) print all nodes of the circular linkedList" );
        Scanner sc= new Scanner(System.in);
        int choice= sc.nextInt();
        switch (choice) {
            case 1: {
                boolean res = cycDetection(head);
                System.out.println(res);
                break;
            }
            case 2: {
                boolean res = FloydscycDetection(head);
                System.out.println("cycle detected: "+res);


            }
            case 3:
            {
                cycDetectRemove(head);
            }
            case 4:
            {
                printAllNodes(head);
            }
        }
    }

    private static void printAllNodes(node head) {
        node rest_p=head;
        node movable_p=head.next;
        System.out.print(rest_p.data+"->");
        while (rest_p != movable_p)
        {
            System.out.print(movable_p.data+"->");
            movable_p=movable_p.next;
        }
        System.out.print("then will begain from starting as it is circular Linked List" );
    }

    private static void cycDetectRemove(node head) {

    }
// solution will not work
 //   private static node cycRemoval(node head, boolean res) {
//        if(res==false) return head;
//        node slowRef=head,fastRef=head,curr=head,slowerref=null;
//        boolean flag=false;
//        while(curr.next.next!=null )
//        {
//            slowRef=slowRef.next;
//            slowerref=head;
//            fastRef=fastRef.next.next;
//            if (slowRef==fastRef)
//            {
//                flag=true;
//                break;
//            }
//            slowerref=slowerref.next;
//            curr=curr.next;
//        }
//        slowerref=null;
//        return head;
//    }

    private static boolean FloydscycDetection(node head) {
        node slowRef=head,fastRef=head,curr=head;
        boolean flag=false;
        while(curr.next.next!=null )
        {
            slowRef=slowRef.next;
            fastRef=fastRef.next.next;
            if (slowRef==fastRef)
            {
                flag=true;
                break;
            }
            curr=curr.next;
        }
        return  flag;
    }

    private static boolean cycDetection(node head) {
        boolean flag=false;
        node curr=head;
        while( curr.next !=null)
        {
            if(curr.visited==true) {flag=  true; break;}
            curr.visited=true;

            curr=curr.next;
        }
        return  flag;
    }

}
