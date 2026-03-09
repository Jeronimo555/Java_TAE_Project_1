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

        Class cs2 = university.createClass("Physics",t2,"CS-002");
        cs2.addStudentToClass(st2);
        cs2.addStudentToClass(st3);
        cs2.addStudentToClass(st4);

        Class cs3 = university.createClass("English",t3,"CS-003");
        cs3.addStudentToClass(st5);

        Class cs4 = university.createClass("Philosophy",t4,"CS-010");
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
                    printClassSubmenu(university);
                    break;
                case "c":
                    createNewStudentMenu(university);
                    break;
                case "d":
                    createClassWithExistingData(university);
                    break;
                case "e":
                    listClassPerStudent(university);
                    break;
                case "f":
                    running = false;
                    break;
            }
        }
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

    public static void printClassSubmenu(University university){

        university.printAllClasses();

        System.out.print("\nEnter the Class name to see details (or 0 to go back): ");
        String class_name = scanner.nextLine();

        if (class_name.equals("0")){
            return;
        }

        university.printClassDetails(class_name);
    }

    public static void createNewStudentMenu(University university){

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Class name to add student to: ");
        String class_name = scanner.nextLine();

        Student new_student = university.createStudent(name,age);
        Class university_class = university.findClass(class_name);

        if (university_class != null){
            university_class.addStudentToClass(new_student);
            System.out.println("The student was successfully created and added to the " + class_name + " class!");
        }

    }

    public static void createClassWithExistingData(University university){

        System.out.print("Enter Class Name: ");
        String class_name = scanner.nextLine();


        if (university.findClass(class_name) != (null)){
            System.out.println("That class already exists.");
            return;
        }

        //Helps the creation process.
        university.printTeachers();

        System.out.print("Enter An existing teacher: ");
        String teacher_name = scanner.nextLine();
        Teacher teacher = university.findTeacher(teacher_name);

        if (teacher == (null)){
            return;
        }

        System.out.print("Type the name of a classroom: ");
        String classroom = scanner.nextLine();

        Class new_class = new Class(class_name,teacher,classroom);

        //Helps the creation process.
        university.printStudents();

        System.out.println("How many students do you wish to add?");
        int amount_of_students = Integer.parseInt(scanner.nextLine());

        if (amount_of_students < 0){
            System.out.println("Invalid amount!");
            return;
        }

        for (byte i = 0; i<amount_of_students;i++) {

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            Student student = university.findStudent(name);

            if (student == null) {
                continue;
            }

            new_class.addStudentToClass(student);
        }

        university.getListOfClasses().add(new_class);
    }

    public static void listClassPerStudent(University university){
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        Student student = university.findStudent(name);

        if (student == null) {
            return;
        }

        System.out.println("The student is currently enrolled in: ");

        for (Class university_class : university.getListOfClasses()){
            if (university_class.getListOfStudents().contains(student)){
                System.out.println("-" + university_class.getName());
            }
        }
    }
}
