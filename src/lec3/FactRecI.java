package lec3;
public class FactRecI {
    public static void main(String[] args){
        int k = 20;
        System.out.println("factorial("+k+") = " + factorial(k));
    }
    public static int factorial(int n){
        if (n == 0) {
            return (1);
        }
        else {
            int result = n * factorial(n-1);
            return (result);
        }
    }
}
