package Java_TAE_Project_1;

import java.util.Objects;

public abstract class Teacher extends Person{
    private int years_of_experience;
    private int hours_per_week;
    private double salary;

    //Base pay is 5 per hour$ (very realistic*)
    final double BASE_PAY = 5;

    public Teacher(String name, int age, int years_of_experience, int hours_per_week) {
        super(name, age);
        this.years_of_experience = years_of_experience;
        this.hours_per_week = hours_per_week;
    }

    public abstract void calculateSalary(int years_of_experience, int hours_per_week);

    public int getYearsOfExperience() {
        return years_of_experience;
    }

    public void setYearsOfExperience(int years_of_experience) {
        this.years_of_experience = years_of_experience;
    }

    public int getHoursPerWeek() {
        return hours_per_week;
    }

    public void setHoursPerWeek(int hours_per_week) {
        this.hours_per_week = hours_per_week;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBASEPAY() {
        return this.BASE_PAY;
    }
}
