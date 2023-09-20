package lec6_7.complexity;

public class Complexity {
    public static void main(String[] args) {
        System.out.println(example1(100));
        System.out.println(example2(100));
        System.out.println(example3(100));
    }

    // Single 'for' loop
    static int example1(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + 1;
        }
        return sum;
    }

    // Doubly nested 'for' loop
    static int example2(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    // Triple nested 'for' loop
    static int example3(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    sum = sum + 1;
                }}}
        return sum;
    }
}
