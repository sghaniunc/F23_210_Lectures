package lec6_7.complexity;
// Example of Linear Search
public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {20, 5, 3, 25, 10, 4, 61};
        int x = 61;         // The number to search for
        System.out.println(searchArray(a, x));
    }
    static boolean searchArray(int[] a, int key){
        boolean result = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return(true);
            }}
        return(false);
    }
}
