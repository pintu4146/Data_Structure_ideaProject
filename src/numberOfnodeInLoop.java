//in this find the no of node is loop is present in the Linked List


public class numberOfnodeInLoop {
    public static  void main(String[] args)
    {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        //head.next.next.next.next=head;
        isLoop(head);
    }

    private static void isLoop(node head) {
        node slow_p=head,fast_p=head;
        while(fast_p != null && fast_p.next != null)
        {
            slow_p=slow_p.next;
            fast_p=fast_p.next.next;
            if(slow_p == fast_p)
            {
                System.out.println("loop is present hence loop counter fun has been called ");
                countNodeInLoop(fast_p);
                break;
            }
        }
        if(slow_p != fast_p)
               System.out.println("No loop deteccted so no need to count or we can say node " +
                "in the loop is 0");
    }

    private static void countNodeInLoop(node fast_p) {
        node rest_p=fast_p;
        int count=1;
        fast_p=fast_p.next;
        while (fast_p != rest_p )
        {
            count++;
            fast_p=fast_p.next;
        }
        System.out.println("# of nodes present in the loop "+count);
    }
}
