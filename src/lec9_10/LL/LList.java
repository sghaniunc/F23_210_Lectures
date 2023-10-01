package lec9_10.LL;

class LList implements LListInt {
    Node _head;
    Node _tail;

    LList(int value){           // constructor - creates the head node
        _head = new Node(value);
        _tail = _head;
    }

    @Override
    public Node getHead() {
        return (_head);
    }

    @Override
    public Node getTail() {
        return (_tail);
    }

    @Override
    public Node insertNode(int value) {
        Node node = new Node(value);
        _tail._nextNode = node;
        _tail = node;
        return (node);
    }

    @Override
    public boolean deleteNode(int value) {
        return false;
    }


    @Override
    public int search(Node node, int n, int i) {
        if (node != null) {
            if (node._value == n) {
                return (i);
            } else if (node._nextNode == null) {
                return (-1);
            } else {
                return (search(node._nextNode, n, ++i));
            }
        }
        else {
            return (-1);
        }
    }

    @Override
    public Node search(Node node, int n) {
        if (node == null){
            return (null);
        }
        else{
            if (node._value == n){
                return (node);
            } else if (node._nextNode == null) {
                return (null);
            }
            else {
                return(search(node._nextNode, n));
            }
        }
    }
}
