package lec9_10.Generics;

class PrintArray <E> {    // Prints elements of array T and its class name
    PrintArray(E[] x){
        System.out.println("\nPrintArray constructor:");
        for (int i=0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println("");
    }
}

public class ClassesWithGenDT {
    public static void main (String[] args){
        Character c = 'x';
        Integer[] a = {1, 2, 3, 4};
        Double[] d = {1.1, 2.2, 3.3, 4.4};
        String[] s = {"Hi", "COMP210", "students!"};
        PrintArray<Integer> y3 = new PrintArray<>(a);
        PrintArray<Double> y4 = new PrintArray<>(d);
        PrintArray<String> y5 = new PrintArray<>(s);
    }
}
