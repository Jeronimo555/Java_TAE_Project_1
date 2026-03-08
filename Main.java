package Java_TAE_Project_1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        University university = new University();

        //1. Initialize 2 or more different teachers of each type (Full time, part-time)

        Teacher t1 = university.createFullTimeTeacher("Aidan Griven", 21, 2);
        Teacher t2 = university.createFullTimeTeacher("Firefight Rumeras", 25, 10);
        Teacher t3 = university.createPartTimeTeacher("Shade",22,40);
        Teacher t4 = university.createPartTimeTeacher("Albert Cowling",30,48);


        //2. Initialize a minimum of 6 different students.
        Student st1 = university.createStudent("Arthur Rickerback",22);
        Student st2 = university.createStudent("Emmanuel",21);
        Student st3 = university.createStudent("Juan Sebastian",21);
        Student st4 = university.createStudent("Adeline",21);
        Student st5 = university.createStudent("Lunata",18);
        Student st6 = university.createStudent("Dioltas",50);

        //3. Initialize minimum 4 different classes including its teacher , students and other relevant data
        Class cs1 = university.createClass("Mathematics",t1,"CS-001");
        cs1.addStudentToClass(st1);
        cs1.addStudentToClass(st2);

        Class cs2 = university.createClass("Mathematics",t2,"CS-002");
        cs2.addStudentToClass(st2);
        cs2.addStudentToClass(st3);
        cs2.addStudentToClass(st4);

        Class cs3 = university.createClass("Mathematics",t3,"CS-003");
        cs3.addStudentToClass(st5);

        Class cs4 = university.createClass("Mathematics",t4,"CS-010");
        cs4.addStudentToClass(st6);

        //4.Print a menú including the following options:
            //a. Print all the professors with its data
            //b. Print all the classes and a submenu to select a class in order to print the class data including its
            //teacher and students
            //c. Create a new student and add it to an existing class
            //d. Create a new class and add an existing teacher, existing students and its relevant data
            //e. List all the classes in which a given student is included (hint: search by id)
            //f. Exit

        boolean running = true;



        while(running){

            printMenu();
            String choice = scanner.nextLine().toLowerCase();

            switch (choice){
                case "a":
                    university.printTeachers();
                    break;
                case "b":
                    printClassSubmenu();
                    break;
                case "c":
                    break;
                case "d":
                    break;
                case "e":
                    break;
                case "f":
                    running = false;
                    break;
            }

        }
        university.printStudents();
    }

    public static void printMenu(){
        System.out.println("\n--- University Management System ---");
        System.out.println("a. Print all professors and their data");
        System.out.println("b. Print all classes (Submenu)");
        System.out.println("c. Create a new student and add to a class");
        System.out.println("d. Create a new class with existing data");
        System.out.println("e. Search classes by Student ID");
        System.out.println("f. Exit");
        System.out.print("Select an option: ");
    }


    public static void printClassSubmenu(){

    }



}
