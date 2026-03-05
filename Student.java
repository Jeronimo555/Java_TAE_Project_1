package Java_TAE_Project_1;

public class Student extends Person{
    private int id;

    public Student(int id, String name, int age) {
        super(name, age);
        this.id = id;
    }

    //ID only gets a getter, for it has no need of a setter.
    public int getId() {
        return id;
    }
}
