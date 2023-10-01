package lec9_10.Generics;

// Example of methods without generic data types
public class MethodWithoutGenDT {
    public static void main (String[] args){
        int[] a = {1, 2, 3, 4};
        double[] d = {1.1, 2.2, 3.3, 4.4};
        printInt(a);
        printDouble(d);
    }

    public static void printInt (int[] x){
        System.out.println("printInt method:");
        for (int i=0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println("");
    }

    public static void printDouble (double[] x){
        System.out.println("printDouble method:");
        for (int i=0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println("");
        }
}
