/*0)func to insert at beginig
* here method for insertion at given position
* 2) Searching for an element in the linked list
* */
class node2{
    int data;
    node2 next;
    node2(int val)
    {
        data=val;
        next=null;
    }
}
public class instAtGvenPos {
    public static void main(String[] args)
    {
        //***************************
        node2 head=null;
        head=insertAtBegFUN(head,10);
        head=insertAtBegFUN(head,20);
        head=insertAtBegFUN(head,30);
        head=insertAtBegFUN(head,40);
        head=insertAtBegFUN(head,50);
        head=insertAtBegFUN(head,60);
        head=insertAtBegFUN(head,70);
        display(head);
        //*******************************
        head=insrtAtgvnPos(head,0,3);
        head=insrtAtgvnPos(head,0,10);
        head=insrtAtgvnPos(head,100,8);
        head=insrtAtgvnPos(head,0,9);
        display(head);
        //*******************************
        boolean res=isElemntPresent(head,400);
        System.out.println("Iterative search Result:  "+res);
        //***********************
        boolean RecurssiveRes=isElemntPresentRecurssive(head,10);
        System.out.println("recursive search result:  "+RecurssiveRes);
        //888888888888888888888888888888888888888888888888888888888
        int index=indexOfelement(head,60);
           System.out.println("ELement index= "+index);
    }

    private static int indexOfelement(node2 head, int element) {
        if(head == null) return -1;
        if(head.data==element) return 1;
        int res=indexOfelement(head.next,element);
        if(res>0)
            return res+1;
        else return res;

    }

    private static boolean isElemntPresentRecurssive(node2 head, int element) {
        node2 curr=head;
        boolean flag=false;
        if(curr ==null) {
            flag=false;
            return flag;}
        if(curr.data==element){
            flag=true;
            return flag;}
        flag=isElemntPresentRecurssive(curr.next,element);
        return flag;
    }

    private static boolean isElemntPresent(node2 head, int element) {
        boolean flag=false;
        node2 curr=head;
        while(curr != null)
        {
            if(curr.data==element)
                flag=true;
            curr=curr.next;
        }



        return flag;
    }

    private static node2 insrtAtgvnPos(node2 head, int data, int pos) {
        int sizeOfLinkedList=0;
        node2 curr=head;

        while(curr !=null)
        {
            curr=curr.next;
            sizeOfLinkedList++;
        }
        if(pos>sizeOfLinkedList)
        {
            System.out.println("LinkedLink of lesser Size,so returning the same LinkedList");
            return head;
        }
             curr=head;
        int count=1;
        node2 temp=new node2(data);
        if(pos==1)
        {
            temp.next=head;
            return temp;
        }
        else {
            while (count != pos - 1) {
                curr = curr.next;
                count++;
            }
            node2 curr1 = curr.next;
            curr.next = temp;
            temp.next = curr1;
        }
      return head;
    }

    private static void display(node2 head) {
        node2 curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.print("null\n");
    }

    private static node2 insertAtBegFUN(node2 head, int i) {
        node2 temp=new node2(i);
        if(head==null)
        { return temp;}
        temp.next=head;
        return temp;

    }

}
