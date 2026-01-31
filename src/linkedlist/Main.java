package linkedlist;

import linkedliststack.Stack;
import linkedlistqueue.Queue;
import middlelinkedlist.FindMiddle;


import static floydcycle.DetectLoop.detectloop;
import static middlelinkedlist.FindMiddle.printmiddle;
import static reverselinkedlist.ReverseLinkedList.printList;
import static reverselinkedlist.ReverseLinkedList.reverse;
import static middlelinkedlist.FindMiddle.middlelinkedlist;


public class Main {
    public static void main(String[] args) {

        System.out.println("LINKED LIST");
        LinkedList1 l = new LinkedList1();
        l.insertFirst(10);
        l.insertLast(20);
        l.insertAtPosition(15, 2);
        l.display();
        System.out.println("Count: " + l.count());

        System.out.println("\nSTACK");
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        s.pop();
        s.display();

        System.out.println("\nQUEUE");
        Queue q = new Queue();
        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);
        q.display();
        q.dequeue();
        q.display();



        System.out.println("Original Linked List:");
        printList(l.head);

        l.head = reverse(l.head);

        System.out.println("Reversed Linked List:");
        printList(l.head);

        l.head = middlelinkedlist(l.head);

        System.out.println("Middle of  Linked List: ");
        printmiddle(l.head);

        System.out.println("DetectLoop in  Linked List: ");
       l.head = detectloop(l.head);
    }
}

