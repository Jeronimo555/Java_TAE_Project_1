package Java_TAE_Project_1.src;

import java.util.ArrayList;

public class Class {
    private String name;
    private Teacher teacher;
    private ArrayList<Student> list_of_students;
    private String classroom;

    public Class(String name, Teacher teacher, String classroom) {
        this.name = name;
        this.teacher = teacher;
        this.classroom = classroom;
        this.list_of_students = new ArrayList<>();
    }

    public void addStudentToClass(Student student){
        getListOfStudents().add(student);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getListOfStudents() {
        return list_of_students;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
