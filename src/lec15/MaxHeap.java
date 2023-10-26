package lec15;

import java.util.ArrayList;

public class MaxHeap<T> {
    private ArrayList<PElement<T>> _maxHeap;

    public MaxHeap(){
        _maxHeap = new ArrayList<PElement<T>>();
    }

    // creates a PElement with (value, priority) and
    // enqueues it in the heap and returns its index
    public int enqueue(T value, int priority){
        PElement<T> pE = new PElement<>(value, priority);
        System.out.println("Enqueuing: "+value+", "+priority);
        _maxHeap.add(pE);
        return(bubbleUp(_maxHeap.size() -1));
    }

    // bubblesUp the child PElement at index and returns final index
    int bubbleUp(int index){
        if (index == 0) {
            return(index);
        }
        else {
            PElement<T> child = _maxHeap.get(index);    // child is the element that needs to be bubbled-up
            PElement<T> parent = _maxHeap.get(parentInd(index));
            if (child._priority >=  parent._priority){
                _maxHeap.set(parentInd(index), child);
                _maxHeap.set(index, parent);
                return(bubbleUp(parentInd(index)));
            }
            else{
                return(index);
            }
        }
    }

    // removes max PElement from heap and returns the pElement
    public PElement<T> dequeue() {
        if (_maxHeap.isEmpty()) {
            return null;
        } else if (_maxHeap.size() == 1) {
            return (_maxHeap.remove(0));
        } else {
            PElement<T> retValue = _maxHeap.get(0);
            _maxHeap.set(0, _maxHeap.remove(_maxHeap.size() - 1));   // move last element to the top
            bubbleDown(0);      // bubbleDown the top element
            return (retValue);
        }
    }

    /**
     * TODO: For Assn 5, you will have to implement this
     * recursively moves down element at index to satisfy heap properties
     */
    void bubbleDown(int index){
    }

    boolean hasLeftChild(int index){
        return(validIndex(leftChildInd(index)));}

    boolean hasRightChild(int index){
        return(validIndex(rightChildInd(index)));}

    static int leftChildInd(int index){
        return (2*index+1);}

    static int rightChildInd(int index){
        return (2*index+2);}

    static int parentInd(int index){
        return ((index-1)/2);}

    boolean validIndex(int index){
        if ((index >= 0) && (index <= _maxHeap.size()-1)){
            return true;}
        else {return false;}}

    void printHeap(){
        System.out.println("Heap=");
        for (int i=0; i<_maxHeap.size(); i++){
            System.out.println(i+ ": "+_maxHeap.get(i)._value+ ", "+_maxHeap.get(i)._priority);
        }
    }

}
