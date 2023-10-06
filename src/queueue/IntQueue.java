package queueue;

public class IntQueue {

    private QueueMethods queue;

    public IntQueue() {

        queue = new QueueMethods();

    }

    public void enqueue (int data) {

        queue.insertLast(data);

    }

    public int size () {

        return queue.getSize();

    }

    public int dequeue() {
        if (queue.getSize() == 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        int first = queue.head.data;
        System.out.println("The deleted Element is " + first);
        queue.remove(0);
        return first;
    }

    public int[] dequeue(int n) {
        int[] first = new int[n];
        for (int i = 0; i < n; i++) {
            first[i] = queue.head.data;
            dequeue();
        }

        return first;
    }

    public void print() {

        queue.print();
        System.out.println("The amount of Elements " + size());
        System.out.println();

    }

}
