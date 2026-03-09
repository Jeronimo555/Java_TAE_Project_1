package Java_TAE_Project_1;

import java.util.UUID;

public class Student extends Person{
    private String id;

    public Student(String name, int age) {
        super(name, age);
        this.id = UUID.randomUUID().toString();;
    }

    //ID only gets a getter, for it has no need of a setter.
    public String getId() {
        return id;
    }
}
