package linkedliststack;

import linkedlist.LinkedList1;

public class Stack {

    LinkedList1 list = new LinkedList1();


    public void push(int data)
    {
        list.insertFirst(data);
    }


    public void pop()
    {
        list.removeFirst();
    }


    public void display()
    {
        list.display();
    }
}
