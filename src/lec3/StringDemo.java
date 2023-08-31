package lec3;

public class StringDemo {
    public static void main (String[] args){
        String s1 = "Hello";
        String s2 = "Hi";
        String s3 = "Hello";
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        System.out.println(s1.substring(1));
        System.out.println(s1.toLowerCase());
        if (s1 == s3)
            System.out.println("Strings are the same!");
        else
            System.out.println("Strings are NOT the same!");
    }
}
