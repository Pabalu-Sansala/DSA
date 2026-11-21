package submission2;


public class ArrayCircularQueue {

    int[] arr;
    int front;
    int rear;
    int size;

    // Constructor
    public ArrayCircularQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue
    public void enqueue(int data) {

        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    // Dequeue
    public void dequeue() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted: " + arr[front]);

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    // Display
    public void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        System.out.print("Queue: ");

        while (true) {
            System.out.print(arr[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % size;
        }

        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {

        ArrayCircularQueue q = new ArrayCircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Original Queue:");
        q.display();

        q.dequeue();

        System.out.println("After Dequeue:");
        q.display();

        q.enqueue(50);
        q.enqueue(60);

        System.out.println("After Enqueue:");
        q.display();
    }
}

