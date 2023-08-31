package lec3;
public class Arrays {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 5};

        int sum = 0; // = sum of a[i]
        for (int i=0; i < a.length; i++) {
            sum += a[i];
        }
 //       System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
