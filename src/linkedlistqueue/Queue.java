package linkedlistqueue;

import linkedlist.LinkedList1;
public class Queue {

    LinkedList1 list = new LinkedList1();


    public void enqueue(int data)
    {
        list.insertLast(data);
    }


    public void dequeue()
    {
        list.removeFirst();
    }


    public void display()
    {
        list.display();
    }
}

