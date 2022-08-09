/*This video discusses the problem of detecting a loop using the method of Floyd cycle detection.*/


public class cycleDetectionFloydCycleDetextion {
    public static void main(String[] args)
    {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
      // head.next.next.next.next=head.next;
        System.out.println(isLoop(head));//is loop and cycle
    }

    private static boolean isLoop(node head) {
        node curr=head;
        node slow_p=curr;
        node fast_p=curr;
        while(fast_p != null && fast_p.next!=null)//10->20->30->40
        {

            slow_p=slow_p.next;
            fast_p=fast_p.next.next;

            if(slow_p == fast_p)
            {
                return true;
            }
//            slow_p=curr.next;
//            fast_p=curr.next.next;
//            curr=curr.next;
        }
        return false;

    }
}
