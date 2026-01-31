package linkedlist;

public class LinkedList1 {

    public Node head;

    public LinkedList1() {
        head = null;
    }


    public boolean isEmpty() {

        return head == null;
    }


    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtPosition(int data, int pos) {
        if (pos == 1) {
            insertFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }


    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }


    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }


    public void removeAtPosition(int pos) {
        if (pos == 1) {
            removeFirst();
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp.next == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public int count() {
        int c = 0;
        Node temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }
}

