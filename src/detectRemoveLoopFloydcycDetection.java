//detect the cycle and remove the loop;



public class detectRemoveLoopFloydcycDetection {
    public static void main(String[] args)
    {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
         head.next.next.next.next=head.next;
         node slow_p=head;
         node fast_p=head;
         while(fast_p !=null && fast_p.next !=null)
         {
             slow_p=slow_p.next;
             fast_p=fast_p.next.next;
             if(slow_p == fast_p) {
                 System.out.println("loop detected");
                 break;
             }
         }
         if(slow_p != fast_p){
             System.out.println("loop not detected");
             System.out.println("Since loop not detected then do not call loop removal function ");
         }
         slow_p=head;

         while (slow_p.next !=fast_p.next)
         {
             slow_p=slow_p.next;
             fast_p=fast_p.next;
         }
         fast_p.next=null;
         while (head != null)
         {
             System.out.println(head.data);
             head=head.next;
         }

    }
}
