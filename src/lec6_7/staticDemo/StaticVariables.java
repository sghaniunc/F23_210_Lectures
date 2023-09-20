package lec6_7.staticDemo;

public class StaticVariables {
    public static void main(String[] args) {

        // ***** static vs non-static VARIABLES:
        System.out.println(ClassA.staticVar);   // staticVar does not require instantiating the class

//      System.out.println(ClassA.nonStaticVar);// This will not work
        ClassA cA = new ClassA();               // instantiating ClassA and creating object cA
        System.out.println(cA.nonStaticVar);    // nonStaticVar can only be accessed via an object
    }
}

class ClassA {
    static int staticVar = 20;
    int nonStaticVar = 30;
}
