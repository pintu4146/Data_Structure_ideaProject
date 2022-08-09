public class cycleDetection2 {
    public static  void main(String[] str)
    {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        head.next.next.next.next=head.next;
        boolean res=cycleD(head);//i will traverse the node will mark as visited
         System.out.println(res);//and if i will encounter visited then will break the loop
                                 //will return true;
    }

    private static boolean cycleD(node head) {
        node curr=head;
        while(curr !=null)
        {
            if(curr.visited == true) return true;
            curr.visited=true;
            curr=curr.next;
        }
        return false;
    }

}
