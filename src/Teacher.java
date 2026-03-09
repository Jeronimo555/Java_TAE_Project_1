package Java_TAE_Project_1.src;

public abstract class Teacher extends Person {
    private double salary;

    //Base pay is 5 per hour$ (very realistic*)
    private final static double BASE_PAY = 5;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public abstract void calculateSalary();

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBasePay() {
        return BASE_PAY;
    }
}
