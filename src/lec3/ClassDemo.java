package lec3;

import java.util.Scanner;

public class ClassDemo {
    public static void main(String[] args) {

        UncStudent st = new UncStudent();
        st._fName = "John";
        st._lName = "Smith";
        st._id = 10;
        System.out.println(st._fName + " " + st._lName + " has id = " + st._id );

        UncStudent st2 = new UncStudent();
        st2._fName = "Ann";
        st2._lName = "Lee";
        st2._id = 20;
        System.out.println(st2._fName + " " + st2._lName + " has id = " + st2._id );

        Scanner s=new Scanner(System.in);
        UncStudent st3 = new UncStudent();
        System.out.println("Enter first name:");
        st3._fName = s.next();
        System.out.println("Enter last name of "+st3._fName);
        st3._lName = s.next();
        System.out.println("Enter student id (max 9 digits):");
        st3._id = s.nextInt();
        System.out.println(st3._fName+" "+st3._lName+" had id = "+ st3._id);

    }
}
