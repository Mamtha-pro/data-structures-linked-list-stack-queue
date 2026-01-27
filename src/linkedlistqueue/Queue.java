package linkedlistqueue;

import linkedlist.LinkedList1;
public class Queue {

    LinkedList1 list = new LinkedList1();

    // enqueue
    public void enqueue(int data) {
        list.insertLast(data);
    }

    // dequeue
    public void dequeue() {
        list.removeFirst();
    }

    // display
    public void display() {
        list.display();
    }
}

