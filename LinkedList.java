public class LinkedList {
    Node head ;

    static class Node{
        int val;
        Node next;
        Node(int data){
            val = data;
            next = null;
        }


    }

    public void printList(){
        Node h = head;
        while(h != null){
            System.out.print(h.val + " ");
            h = h.next;
        }
        System.out.println();
    }

    public void printList2(Node head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }


    /* This function is in LinkedList class. Inserts a
   new Node at front of the list. This method is
   defined inside LinkedList class shown above */
    //O(1)

    public void push(int new_val){
        Node new_node = new Node(new_val);
        new_node.next = head;
        head = new_node;

    }

    public void insertAfter(Node pre, int new_val){
        if(pre == null){
            System.out.println("THe given node is null");
            return;
        }

        Node new_node = new Node(new_val);

        new_node.next = pre.next;
        pre.next = new_node;

    }

    public void insertAtend(int new_val){
        Node new_node = new Node(new_val);
        Node n = head;
        while(n.next != null){
            n = n.next;
        }

        n.next = new_node;
    }

    //1. Find previous node of the node to be deleted.
    //2. Change the next of previous node.
    //3. Free memory for the node to be deleted.
    public void delete(int val){
        Node temp = head;
        Node pre = head;

        while(temp.val != val && temp != null){
            pre = temp;
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Please check your value");
            return;
        } else {
            if(temp == head){
                head = head.next;
            } else {
                pre.next = temp.next;
                temp.next= null;
            }

        }
    }


    public void deletetbyIndex(int position){
        Node n = head;
        Node pre = head;

        if(position == 0) {
            head = head.next;
            return;
        }

        for(int i = 0;i<position-1;i++){
            pre = pre.next;

            if(pre.next == null){
                System.out.println("Index is out of length of linded list");
                return;
            }

        }

        if(pre.next.next == null)
        {
            pre.next =  null;
        } else
            pre.next = pre.next.next;

    }


    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//
//        linkedList.head = a;
//        a.next = b;
//        b.next = c;
//        linkedList.printList2(a);
//
//        //push
//        linkedList.push(0);
//        linkedList.printList();
//
//        //insertAfter
//        linkedList.insertAfter(c,4);
//        linkedList.printList();
//
//        //insertAtend
//        linkedList.insertAtend(5);
//        linkedList.printList();
//
//
//        //deletebyval
//        linkedList.delete(5);
//        linkedList.printList();
//
//        //deletebyindex
//        linkedList.deletetbyIndex(4);
//        linkedList.printList();
        int c = -1;
        try{
            c = 4/0;
        } catch (Exception e ){
            System.err.println("Exception e");
        }
        finally {
            System.err.println("Finnlay");
        }
    }
}
