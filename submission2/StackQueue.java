package submission2;


import java.util.Deque;
import java.util.ArrayDeque;

public class StackQueue {

    Deque<Integer> deque = new ArrayDeque<>();

    // Push - Stack
    public void push(int data) {
        deque.addFirst(data);
    }

    // Pop - Stack
    public void pop() {
        if (deque.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Popped: " + deque.removeFirst());
    }

    // Enqueue - Queue
    public void enqueue(int data) {
        deque.addLast(data);
    }

    // Dequeue - Queue
    public void dequeue() {
        if (deque.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Dequeued: " + deque.removeFirst());
    }

    // Display
    public void display() {
        if (deque.isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }

        System.out.println(deque);
    }

    // Main Method
    public static void main(String[] args) {

        StackQueue sq = new StackQueue();

        sq.push(10);
        sq.push(20);
        sq.push(30);

        System.out.println("After Push:");
        sq.display();

        sq.pop();

        System.out.println("After Pop:");
        sq.display();

        sq.enqueue(40);
        sq.enqueue(50);

        System.out.println("After Enqueue:");
        sq.display();

        sq.dequeue();

        System.out.println("After Dequeue:");
        sq.display();
    }
}
