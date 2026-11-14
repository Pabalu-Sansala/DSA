
package submission1;

import java.util.Stack;

public class QueueStackEnqueueFriendly {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    // Enqueue method
    public void enqueue(int element) {

        s1.push(element);

        System.out.println(element + " enqueued");
    }

    // Dequeue method
    public int dequeue() {

        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // Move elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Remove the front element
        int removed = s2.pop();

        // Move remaining elements back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return removed;
    }

    // Peek method
    public int peek() {

        if (s1.isEmpty()) {
            return -1;
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int front = s2.peek();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return front;
    }

    // Check empty
    public boolean isEmpty() {
        return s1.isEmpty();
    }

    // Get size
    public int size() {
        return s1.size();
    }

    // Main method
    public static void main(String[] args) {

        QueueStackEnqueueFriendly queue =
                new QueueStackEnqueueFriendly();

        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);

        System.out.println("Front: " + queue.peek());

        System.out.println("Dequeued: " + queue.dequeue());

        System.out.println("Current size: " + queue.size());

        System.out.println("Is empty? " + queue.isEmpty());
    }
}
