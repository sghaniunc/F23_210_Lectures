package lec13_14.d_Q_Int;

// Example of Queues using both ArrayList and Linked Lists with interfaces
public class MainQueueInt {
    public static void main(String[] args){
        testSetA();     // Example using Integers
        testSetB();     // Example using Strings
    }
    static void testSetA(){
        QueueLL<Integer> queue = new QueueLL<>();
        queue.enqueue(10);
        System.out.println("Enqueued = "+ 10 + ", queue size = "+queue.getSize());
        queue.enqueue(20);
        System.out.println("Enqueued = "+ 20 + ", queue size = "+queue.getSize());
        queue.enqueue(30);
        System.out.println("Enqueued = "+ 30 + ", queue size = "+queue.getSize());
        System.out.println("queue dequeued value = "+ queue.dequeue());
        System.out.println("queue dequeued value = "+ queue.dequeue());
        System.out.println("queue dequeued value = "+ queue.dequeue());
    }
    static void testSetB(){
        QueueA<String> queue = new QueueA<>();
        String s;
        s = "How";
        queue.enqueue(s);
        System.out.println("Enqueued = "+ s + ", queue size = "+queue.getSize());
        s = "are";
        queue.enqueue(s);
        System.out.println("Enqueued = "+ s + ", queue size = "+queue.getSize());
        s = "you?";
        queue.enqueue(s);
        System.out.println("Enqueued = "+ s + ", queue size = "+queue.getSize());

        System.out.println("queue dequeued value = "+ queue.dequeue());
        System.out.println("queue dequeued value = "+ queue.dequeue());
        System.out.println("queue dequeued value = "+ queue.dequeue());

    }
}
