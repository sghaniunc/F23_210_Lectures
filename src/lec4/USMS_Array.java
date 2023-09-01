package lec4;

import java.util.Scanner;
/**
 * Implements an Array based implementation of USMS: UNC Students Management System.
 */
public class USMS_Array {
    static int maxStudents = 10;
    static UncStudent[] sList = new UncStudent[maxStudents];
    static int nextIndex = 0;     // Index in sList for next entry

    public static void main(String[] args) {
        while (menu()!=0);
    }

    public static int menu() {  // returns 0 to exit
        Scanner s = new Scanner(System.in);
        boolean exit = false;
        System.out.println("\nWelcome to the UNC Students Management System(USMS)");
        System.out.println("Press one of the following keys:");
        System.out.println("1 : For enrolling a new student");
        System.out.println("2 : Print all students");
        System.out.println("3 : For searching for a student");
        System.out.println("0 : For exiting.");
        int selectionI = s.nextInt();
        switch (selectionI) {
            case 1: {
                sList[nextIndex] = enrollStudent();
                nextIndex++;
                break;}
            case 2: {printAllStudents();                    break;}
            case 3: {searchStudent();                       break;}
            case 0: {exit = true;                           break;}
            default: {System.out.println("Invalid Entry."); break;}
        }
        if (exit) { System.out.println("Thank you for using USMS. Good bye!");
            return (0); }
        return(1);
    }

    static UncStudent enrollStudent(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enrolling a new student:");
        UncStudent st = new UncStudent();
        System.out.println("Enter first name:");
        st._fName = s.next();
        System.out.println("Enter last name of "+st._fName);
        st._lName = s.next();
        System.out.println("Enter student id (max 9 digits):");
        st._id = s.nextInt();
        System.out.println("Student: "+st._fName+" "+st._lName+" with id = "+ st._id+ " enrolled.");
        return(st);
    }
    static void printAllStudents(){
        System.out.println("Printing all " + nextIndex+" students :");
        for (int i=0; i<nextIndex; i++){
            System.out.println(i+". "+sList[i]._fName+" "+sList[i]._lName+", id="+sList[i]._id);
        }
    }

    static void searchStudent(){
        Scanner s = new Scanner(System.in);
        System.out.println("Searching an enrolled student:");
        System.out.println("Enter first or last name:");
        String name = s.nextLine();
        for (int i=0; i< nextIndex; i++){
            if (sList[i]._fName.equals(name) || (sList[i]._lName.equals(name))){
                System.out.println(i+". "+sList[i]._fName+" "+sList[i]._lName+", id="+sList[i]._id);
            }
        }
    }

}
