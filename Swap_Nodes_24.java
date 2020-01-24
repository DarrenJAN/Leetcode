import java.util.List;

public class Swap_Nodes_24 {
    static public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode new_head = head.next;
        head.next = new_head.next;
        new_head.next = head;

        ListNode pre = head;
        ListNode start = head.next;
       while(start != null && start.next != null){
            ListNode temp = null;
            if(start.next.next != null)
            {
                temp = start.next.next;
                pre.next = start.next;
                start.next.next = start;
                start.next = temp;

                pre = start;
                start = temp;
            }else {
                pre.next = start.next;
                start.next.next = start;
                start.next = null;
            }

        }

        return new_head;

    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);

        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        ListNode temp = a;
        while( temp!= null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        Swap_Nodes_24 sw = new Swap_Nodes_24();
        ListNode res = sw.swapPairs(f);

        System.out.println();
        while(res != null){
            System.out.print(res.val+ " ");
            res = res.next;
        }
    }
}
