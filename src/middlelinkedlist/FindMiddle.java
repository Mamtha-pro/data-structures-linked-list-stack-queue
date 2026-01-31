package middlelinkedlist;

import linkedlist.Node;

public class FindMiddle
{

    public static Node middlelinkedlist(Node head)
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
    public  static void printmiddle(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data + " ");
         break;
        }

    }

}

