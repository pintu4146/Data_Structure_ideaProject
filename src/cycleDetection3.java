import java.util.HashSet;

public class cycleDetection3 {
    public  static  void  main(String[] str)
    {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        head.next.next.next.next=head.next;
        System.out.println(cycleD(head));
    }

    private static boolean cycleD(node head) {
        HashSet<node> hs=new HashSet<>();//using hashset
        for(node curr=head;curr != null ;curr=curr.next)
        {
            if(hs.contains(curr))
            {
                return true;
            }
            else hs.add(curr);
        }
        return  false;
    }
}
