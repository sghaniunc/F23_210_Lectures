package lec6_7.staticDemo;

public class StaticMethods {
    public static void main(String[] args){

        // ***** static vs non-static METHODS:
        ClassB.staticMethod();

//        ClassB.nonStaticMethod();         // This will not work
        ClassB cB = new ClassB();
        cB.nonStaticMethod();
    }
}

class ClassB {
    static void staticMethod() {
        System.out.println("This is a Static Method");
    }
    void nonStaticMethod() {
        System.out.println("This is a NON-Static Method");
    }
}
