package lec13_14.d_Q_Int;

// Queue: Linked List implementation with Interfaces
// First In First Out (FIFO)
public class QueueLL<T> implements QueueInt<T> {
    private Node<T> _head;   // head of the queue
    private Node<T> _tail;   // tail of the queue
    private int _size;      // size of queue

    // pushes a node to the top of the queue
    public int enqueue(T value){
        Node<T> node = new Node<>();
        node._value = value;
        node._prevNode = null;
        if (_size == 0){
            _head = node;
        }
        else {
            _tail._prevNode = node;
        }
        _tail = node;
        _size++;
        return (_size-1);
    }

    // dequeues from the head of the queue and returns the node
    public T dequeue(){
        Node<T> tempNode = _head;
        if (_head == null){
            return(null);
        }
        else if (_size == 1) {
            _head = null;
            _tail = null;
        }
        else {  // _size > 1
            _head = _head._prevNode;
        }
        _size--;
        tempNode._prevNode = null;  // reset before returning
        return (tempNode._value);
    }
    public int getSize(){
        return (_size);
    }
}
