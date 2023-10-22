package lec13_14.a_Stack_LL;

// Stack implementation using Linked Lists (without Interfaces)
// First In Last Out (FILO)
public class Stack<T> {
    private Node<T> _top;   // top of stack
    private int _size;      // size of stack

    // pushes a node to the top of the stack
    public void push(T value){
        Node<T> node = new Node<T>();
        node._value = value;
        node._lowerNode = _top;
        _top = node;
        _size++;
    }

    // pops the top of the stack and returns the node
    public Node<T> pop(){
        Node<T> tempNode = _top;
        if (_top == null){
            return(null);
        }
        else {
            _top = _top._lowerNode;
            _size--;
            return(tempNode);
        }
    }

    public int getSize(){
        return (_size);
    }
    public Node<T> getTop(){
        return (_top);
    }
}
