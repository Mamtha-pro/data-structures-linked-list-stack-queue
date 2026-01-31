package floydcycle;

import linkedlist.Node;

public class DetectLoop {

    public static Node detectloop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow == fast) {
            System.out.print("true");
        }
            else{
                System.out.println("false");
            }
return head;
    }

}




