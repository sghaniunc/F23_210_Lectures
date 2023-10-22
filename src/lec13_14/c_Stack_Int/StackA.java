package lec13_14.c_Stack_Int;

import java.util.ArrayList;

// Stack implementation using ArrayLists (with Interfaces)
// First In Last Out (FILO)
public class StackA<T> implements StackInt<T> {
    private ArrayList<T> _stack;

    public StackA(){
        _stack = new ArrayList<T>();
    }

    // pushes a node to the top of the stack
    public int push(T value){
        _stack.add(value);
        return (getSize()-1);
    }

    // pops the top of the stack and returns the value
    // (=null if stack empty)
    public T pop() {
        if (_stack.size() == 0) {
            return (null);
        } else {
            return (_stack.remove(_stack.size()-1));
        }
    }

    public int getSize(){
        return (_stack.size());
    }
}
