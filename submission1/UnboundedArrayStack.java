
package submission1;


public class UnboundedArrayStack {

    private int[] arr;
    private int top;

    // Constructor
    public UnboundedArrayStack() {
        arr = new int[3];
        top = -1;
    }

    // Check whether stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Expand array size
    private void resize() {
        int[] newArr = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    // Push element
    public void push(int value) {
        if (top == arr.length - 1) {
            resize();
        }

        arr[++top] = value;
        System.out.println(value + " pushed");
    }

    // Pop element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top--];
    }

    // Peek top element
    public int peek() {
        if (isEmpty()) {
            return -1;
        }

        return arr[top];
    }

    // Get stack size
    public int size() {
        return top + 1;
    }

    // Main method
    public static void main(String[] args) {

        UnboundedArrayStack stack = new UnboundedArrayStack();

        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        System.out.println("Popped: " + stack.pop());

        System.out.println("New top: " + stack.peek());
        System.out.println("Current size: " + stack.size());
    }
}

