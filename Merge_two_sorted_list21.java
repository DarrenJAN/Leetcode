import java.util.List;

public class Merge_two_sorted_list21 {
    static public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head  = null;
        ListNode track  = null;
        while(l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                if(l1.val < l2.val){
                    ListNode nn = new ListNode(l1.val);
                    if(head == null){
                        head = nn;
                        track =nn;
                    } else {
                        track.next = nn;
                        track = track.next;
                    }

                    l1 = l1.next;
                }
                else {
                    ListNode nn = new ListNode(l2.val);
                    if(head == null){
                        head = nn;
                        track =nn;
                    } else{
                        track.next = nn;
                        track = track.next;
                    }

                    l2 = l2.next;
                }
            }

            else if (l1 != null){
                ListNode nn = new ListNode(l1.val);
                if(head == null){
                    head = nn;
                    track =nn;
                } else {
                    track.next = nn;
                    track = track.next;
                }

                l1 = l1.next;
            }
            else {
                ListNode nn = new ListNode(l2.val);
                if(head == null){
                    head = nn;
                    track =nn;
                } else {
                    track.next = nn;
                    track = track.next;
                }

                l2 = l2.next;
            }
        }
        return head;
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

        d.next = e;
        e.next = f;

        Merge_two_sorted_list21  m = new Merge_two_sorted_list21();
        ListNode res = m.mergeTwoLists(a,d);

        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
