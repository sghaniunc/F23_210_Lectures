package lec13_14.d_Q_Int;
public interface QueueInt<T> {
    int enqueue(T value);           // returns index after enqueueing
    T dequeue();                    // returns the value after dequeueing
    int getSize();                  // returns size of Queue
}
