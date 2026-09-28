// Name: Daniyil Burenko
// Language: Java
// IDE: Visual Studio Code

public class Main {
    public static void main(String[] args) {
        int[] values = {15, 25, 35, 45, 55};

        // Stack test
        MyStack stack = new MyStack();
        System.out.println("STACK DEMONSTRATION");
        System.out.println("Adding:");
        for (int value : values) {
            stack.push(value);
            System.out.println(value);
        }
        System.out.println("Top item: " + stack.peek());
        System.out.println("Removing: " + stack.pop());
        System.out.println("Removing: " + stack.pop());
        System.out.println("New top: " + stack.peek());
        System.out.println("Is Stack empty? " + stack.isEmpty());

        System.out.println();

        // Queue test
        MyQueue queue = new MyQueue();
        System.out.println("QUEUE DEMONSTRATION");
        System.out.println("Adding:");
        for (int value : values) {
            queue.enqueue(value);
            System.out.println(value);
        }
        System.out.println("Front item: " + queue.peek());
        System.out.println("Removing: " + queue.dequeue());
        System.out.println("Removing: " + queue.dequeue());
        System.out.println("New front: " + queue.peek());
        System.out.println("Is Queue empty? " + queue.isEmpty());
    }

    // Stack: add and remove items at the top
    static class MyStack {
        private final int[] items = new int[10];
        private int top = -1;

        public void push(int value) {
            if (top == items.length - 1) {
                throw new IllegalStateException("Stack is full");
            }
            top++;
            items[top] = value;
        }

        public int pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            int topItem = items[top];
            top--;
            return topItem;
        }

        public int peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return items[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    // Queue: add at the back, remove from the front
    static class MyQueue {
        private final int[] items = new int[10];
        private int count = 0;

        public void enqueue(int value) {
            if (count == items.length) {
                throw new IllegalStateException("Queue is full");
            }
            items[count] = value;
            count++;
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            int frontItem = items[0];
            // Shift the remaining items one place to the front.
            for (int i = 1; i < count; i++) {
                items[i - 1] = items[i];
            }
            count--;
            return frontItem;
        }

        public int peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return items[0];
        }

        public boolean isEmpty() {
            return count == 0;
        }
    }
}
