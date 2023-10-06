package queueue;

public class QueueRunner {
    public static void main(String[] args) {

        IntQueue queue = new IntQueue();

        queue.enqueue(9);
        queue.enqueue(1);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(4);

        queue.print();

        queue.dequeue();

        queue.print();

        int[] result = queue.dequeue(2);
        String deletedElements = "";
        for (int i = 0; i < result.length ; i++){
            if (i > 0) {
                deletedElements += ", ";
            }
            deletedElements +=result[i];
        }
        System.out.println("die gelöschten Elemente lauten: " + deletedElements);
        queue.print();



    }
}
