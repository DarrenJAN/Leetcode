

public class Remove_nth_node_from_list_19 {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = head;
        int length = 0;

        if(head == null) return null;


        while(tmp != null){
            tmp = tmp.next;
            length ++;
        }


        if(length ==1 ) return null;
        int target = length - n+1;
        if(target ==1) return head.next;

        tmp = head;

        for(int i=1;i<target-1;i++){
            tmp = tmp.next;
        }

        ListNode next = tmp.next.next;
        tmp.next = next;

        return head;


    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        a.next = b;
        b.next =c;
        c.next =d;
        d.next = e;

        ListNode head = d;
        while(head != null){
            System.out.print(head.val);
            head = head.next;
        }
        System.out.println();

        Remove_nth_node_from_list_19 f = new Remove_nth_node_from_list_19();
        head = f.removeNthFromEnd(d,2);

        System.out.println();
        while(head != null){
            System.out.print(head.val);
            head = head.next;
        }

    }

}
