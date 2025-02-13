package queueinterface.circularbuffersimulation;

public class CircularBuffer {
    int[] buffer;
    int size;
    int front;
    int rear;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        front = -1;
        rear = -1;
    }

    public void insert(int value) {
        if ((rear + 1) % size == front) {  // buffer is full
            front = (front + 1) % size; // Overwrite the oldest element
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        buffer[rear] = value;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Buffer is empty.");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(buffer[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.display();  // Output: 1 2 3

        buffer.insert(4);
        buffer.display();  // Output: 2 3 4
    }
}