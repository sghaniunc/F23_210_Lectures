package lec13_14.c_Stack_Int;

// Stack implementation using Linked Lists (with Interfaces)
// First In Last Out (FILO)
public class StackLL<T> implements StackInt<T> {
    private Node<T> _top;   // top of stack
    private int _size;      // size of stack

    // pushes a node to the top of the stack
    public int push(T value){
        Node<T> node = new Node<>();
        node._value = value;
        node._lowerNode = _top;
        _top = node;
        _size++;
        return (_size-1);
    }

    // pops the top of the stack and returns the node value
    public T pop(){
        Node<T> tempNode = _top;
        if (_top == null){
            return(null);
        }
        else {
            _top = _top._lowerNode;
            _size--;
            return(tempNode._value);
        }
    }

    public int getSize(){
        return (_size);
    }
}
