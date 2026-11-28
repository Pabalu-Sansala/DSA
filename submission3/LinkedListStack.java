package submission3;


public class LinkedListStack {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top = null;

    // Push method
    public void push(int data) {

        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
    }

    // Pop method
    public void pop() {

        if (top == null) {
            System.out.println("Stack is empty");
        } else {

            System.out.println("Removed: " + top.data);

            top = top.next;
        }
    }

    // Peek method
    public void peek() {

        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    // Display method
    public void display() {

        Node temp = top;

        if (top == null) {
            System.out.println("Stack is empty");
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

        LinkedListStack stack = new LinkedListStack();

        stack.push(5);
        stack.push(3);
        stack.push(2);
        stack.push(7);

        stack.display();

        stack.peek();

        stack.pop();

        stack.display();
    }
}
