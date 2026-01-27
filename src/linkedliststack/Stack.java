package linkedliststack;

import linkedlist.LinkedList1;

public class Stack {

    LinkedList1 list = new LinkedList1();

    // push
    public void push(int data) {
        list.insertFirst(data);
    }

    // pop
    public void pop() {
        list.removeFirst();
    }

    // display
    public void display() {
        list.display();
    }
}
