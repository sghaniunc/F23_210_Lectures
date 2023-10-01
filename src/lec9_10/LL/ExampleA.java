package lec9_10.LL;

public class ExampleA {
    public static void main(String[] args){
        System.out.println("Inserting 10, 20 and 15 in an unordered Linked List");
        LList list = new LList(10);
        list.insertNode(20);
        list.insertNode(15);

        System.out.println("Searching for index of 5:" + list.search(list._head, 5, 0));
        System.out.println("Searching for index of 15:" +list.search(list._head, 15, 0));
        System.out.println("Searching for index of 10:" +list.search(list._head, 10, 0));
        System.out.println("Searching for index of 20:" +list.search(list._head, 20, 0));
    }
}

