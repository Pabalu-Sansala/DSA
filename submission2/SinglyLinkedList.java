package submission2;


public class SinglyLinkedList {

    // Node Class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    // Insert First
    public void insertFirst(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Insert Last
    public void insertLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Delete First
    public void deleteFirst() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        head = head.next;
    }

    // Delete Last
    public void deleteLast() {

        if (head == null) {
            System.out.println("List is Empty");
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

    // Search
    public void search(int key) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                System.out.println("Value Found");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Value Not Found");
    }

    // Display
    public void display() {

        Node temp = head;

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Main Method
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertFirst(20);
        list.insertFirst(10);
        list.insertLast(30);
        list.insertLast(40);

        System.out.println("Original List:");
        list.display();

        list.deleteFirst();

        System.out.println("After Delete First:");
        list.display();

        list.deleteLast();

        System.out.println("After Delete Last:");
        list.display();

        list.search(30);
    }
}
