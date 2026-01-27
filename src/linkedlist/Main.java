package linkedlist;

import linkedliststack.Stack;
import linkedlistqueue.Queue;


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
    }
}
