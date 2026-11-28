package submission3;


public class CircularDoublyLinkedList {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    // Insert at last
    public void insertLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {

            Node last = head.prev;

            last.next = newNode;
            newNode.prev = last;

            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Display list
    public void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(Back to Head)");
    }

    // Main method
    public static void main(String[] args) {

        CircularDoublyLinkedList list =
                new CircularDoublyLinkedList();

        list.insertLast(5);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(7);

        list.display();
    }
}

