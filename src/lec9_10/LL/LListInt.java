package lec9_10.LL;

// Linked List Interface
public interface LListInt {
    Node getHead();                         // returns the head node.
    Node getTail();                         // returns the tail node.
    Node insertNode(int value);             // inserts a node at end of LL and returns it.
    boolean deleteNode(int value);          // deletes a node and returns true, or false if not found.
    int search(Node node, int n, int i);    // search for first occurrence of int n in LL starting at node,
                                            // assuming index i, and returns its index. -1 if not found.
    Node search(Node node, int n);          // search for first occurrence of int n in LL starting at node,
                                            // and returns it or null if not found.
}
