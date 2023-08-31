package lec3;
public class FactRec {
    public static void main(String[] args){
        int k = 20;
        System.out.println("factorial("+k+") = " + factorial(k));
    }
    public static double factorial(int n){
        if (n == 0) {
            return (1);
        }
        else {
            return (n * factorial(n-1));
        }
    }
}
