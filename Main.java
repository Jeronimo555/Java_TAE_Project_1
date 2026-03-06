package Java_TAE_Project_1;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        //1. Initialize 2 or more different teachers of each type (Full time, part-time)
        university.createFullTimeTeacher("Aidan Griven", 21, 2);
        university.createFullTimeTeacher("Firefight Rumeras", 25, 10);
        university.createPartTimeTeacher("Shade",22,40);
        university.createPartTimeTeacher("Albert Cowling",30,48);

        university.printTeachers();


    }
}
