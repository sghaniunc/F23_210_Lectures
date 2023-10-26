package lec15;

// Binary Heap implementation of a Priority Queue
public class MainHeap {
    public static void main(String[] args) {
        test1();
    }

    static void test1() {
        MaxHeap<String> maxHeap = new MaxHeap<>();
        maxHeap.enqueue("A", 45);
        maxHeap.enqueue("B", 52);
        maxHeap.enqueue("C", 93);
        maxHeap.enqueue("D", 9);
        maxHeap.enqueue("E", 150);
        maxHeap.enqueue("F", 90);

        // After implementing dequeue(), you can write code here to test it.
        maxHeap.printHeap();
        PElement<String> pE;
        pE = maxHeap.dequeue();

    }
}
