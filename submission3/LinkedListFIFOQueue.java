package submission3;


public class LinkedListFIFOQueue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node front = null;
    Node rear = null;

    // Enqueue method
    public void enqueue(int data) {

        Node newNode = new Node(data);

        if (rear == null) {

            front = newNode;
            rear = newNode;

        } else {

            rear.next = newNode;
            rear = newNode;
        }
    }

    // Dequeue method
    public void dequeue() {

        if (front == null) {
            System.out.println("Queue is empty");
        } else {

            System.out.println("Removed: " + front.data);

            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }

    // Peek method
    public void peek() {

        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    // Display method
    public void display() {

        Node temp = front;

        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        while (temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }

        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        LinkedListFIFOQueue queue =
                new LinkedListFIFOQueue();

        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(7);

        queue.display();

        queue.peek();

        queue.dequeue();

        queue.display();
    }
}

