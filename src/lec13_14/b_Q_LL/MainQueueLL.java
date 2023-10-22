package lec13_14.b_Q_LL;

// Example of Queues using Linked Lists without interfaces
public class MainQueueLL {
    public static void main(String[] args){
        testSetA();
        testSetB();
    }
    static void testSetA(){
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        System.out.println("Enqueued = "+ 10 + ", queue size = "+queue.getSize());
        queue.enqueue(20);
        System.out.println("Enqueued = "+ 20 + ", queue size = "+queue.getSize());
        queue.enqueue(30);
        System.out.println("Enqueued = "+ 30 + ", queue size = "+queue.getSize());
        System.out.println("queue dequeued value = "+ queue.dequeue()._value);
        System.out.println("queue dequeued value = "+ queue.dequeue()._value);
        System.out.println("queue dequeued value = "+ queue.dequeue()._value);
    }
    static void testSetB(){
        Queue<String> queue = new Queue<>();
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

        System.out.println("queue dequeued value = "+ queue.dequeue()._value);
        System.out.println("queue dequeued value = "+ queue.dequeue()._value);
        System.out.println("queue dequeued value = "+ queue.dequeue()._value);

    }
}
