package queueinterface.stackusingqueue;
import java.util.*;
public class StackUsingQueues {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Pop: " + stack.pop()); // Output: 3
    }

    public void push(int value) {
        queue1.add(value);
    }

    public int pop() {
        if (queue1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        int top = queue1.remove();

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top;
    }

    public int top() {
        if (queue1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        int top = queue1.peek();
        queue2.add(queue1.remove());

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top;
    }
}
