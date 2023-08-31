package lec3;
public class Example2 {
    public static void main(String[] args){
        int sum=0;
        int[] array = {10, 20, 50, 100};
        for (int i=0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("sum = " + sum);
    }
}
