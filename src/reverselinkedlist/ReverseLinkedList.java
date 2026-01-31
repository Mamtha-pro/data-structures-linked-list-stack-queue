package reverselinkedlist;

import linkedlist.Node;

public class ReverseLinkedList {

     public static Node reverse(Node head) {

            Node prev = null;
            Node curr = head;
            Node next = null;

            while (curr != null) {
                next = curr.next;   // save next node
                curr.next = prev;   // reverse link
                prev = curr;        // move prev forward
                curr = next;        // move curr forward
            }

            return prev; // new head
        }


      public  static void printList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }


}
