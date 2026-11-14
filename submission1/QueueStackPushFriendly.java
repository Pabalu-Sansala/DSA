
package submission1;

import java.util.Deque;
import java.util.ArrayDeque;

public class QueueStackPushFriendly {

    private Deque<Integer> q1 = new ArrayDeque<>();
    private Deque<Integer> q2 = new ArrayDeque<>();

    // Push method
    public void push(int element) {
        q1.addLast(element);
        System.out.println(element + " pushed");
    }

    // Pop method
    public int pop() {

        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        while (q1.size() > 1) {
            q2.addLast(q1.removeFirst());
        }

        int removed = q1.removeFirst();

        Deque<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return removed;
    }

    // Peek method
    public int peek() {
        if (q1.isEmpty()) {
            return -1;
        }

        return q1.getLast();
    }

    // Check empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    // Get size
    public int size() {
        return q1.size();
    }

    // Main method
    public static void main(String[] args) {

        QueueStackPushFriendly stack = new QueueStackPushFriendly();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        System.out.println("Current size: " + stack.size());

        System.out.println("Is empty? " + stack.isEmpty());
    }
}
