package lec13_14.c_Stack_Int;

// Example of Stacks using both ArrayList and Linked Lists with interfaces
public class MainStackInt {
    public static void main(String[] args){
        testSetA();
        testSetB();
    }
    static void testSetA(){
        StackA<Integer> stack = new StackA<Integer>();
        stack.push(10);
        System.out.println("Pushed = "+ 10 + ", Stack size = "+stack.getSize());
        stack.push(20);
        System.out.println("Pushed = "+ 20 + ", Stack size = "+stack.getSize());
        stack.push(30);
        System.out.println("Pushed = "+ 30 + ", Stack size = "+stack.getSize());
        System.out.println("Stack popped value = "+ stack.pop());
        System.out.println("Stack popped value = "+ stack.pop());
        System.out.println("Stack popped value = "+ stack.pop());
    }
    static void testSetB(){
        StackLL<String> stack = new StackLL<>();
        String s;
        s = "How";
        stack.push(s);
        System.out.println("Pushed = "+ s + ", Stack size = "+stack.getSize());
        s = "are";
        stack.push(s);
        System.out.println("Pushed = "+ s + ", Stack size = "+stack.getSize());
        s = "you?";
        stack.push(s);
        System.out.println("Pushed = "+ s + ", Stack size = "+stack.getSize());
        System.out.println("Stack popped value = "+ stack.pop());
        System.out.println("Stack popped value = "+ stack.pop());
        System.out.println("Stack popped value = "+ stack.pop());
    }
}
