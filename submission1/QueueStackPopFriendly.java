package submission1;

import java.util.Deque;
import java.util.ArrayDeque;

public class QueueStackPopFriendly {

    private Deque<Integer> q1 = new ArrayDeque<>();
    private Deque<Integer> q2 = new ArrayDeque<>();

    // Push method
    public void push(int element) {

        q2.addLast(element);

        while (!q1.isEmpty()) {
            q2.addLast(q1.removeFirst());
        }

        Deque<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        System.out.println(element + " pushed");
    }

    // Pop method
    public int pop() {

        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return q1.removeFirst();
    }

    // Peek method
    public int peek() {

        if (q1.isEmpty()) {
            return -1;
        }

        return q1.peekFirst();
    }

    // Check whether stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    // Get stack size
    public int size() {
        return q1.size();
    }

    // Main method
    public static void main(String[] args) {

        QueueStackPopFriendly stack = new QueueStackPopFriendly();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        System.out.println("Current size: " + stack.size());

        System.out.println("Is empty? " + stack.isEmpty());
    }
}
