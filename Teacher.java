package Java_TAE_Project_1;

import java.util.Objects;

public class Teacher extends Person{
    private String status;
    private int years_of_experience;
    private int hours_per_week;
    private double salary;

    public Teacher(String name, int age,String status, int years_of_experience, int hours_per_week) {
        super(name, age);
        this.status = status;
        this.years_of_experience = years_of_experience;
        this.hours_per_week = hours_per_week;
        this.salary = calculateSalary(years_of_experience,hours_per_week);
    }

    public double calculateSalary(int years_of_experience, int hours_per_week){
        //Base pay is 5 per hour$ (very realistic*)
        double base_salary = 5;

        if (getYearsOfExperience() == 0){
            return base_salary;
        }

        if (getStatus().equals("Full_time")){
            //base salary multiplied by 110% of their experience years
            base_salary = base_salary * (1.1 * years_of_experience);
        }
        else if (getStatus().equals("Part_time")) {
            base_salary = base_salary * hours_per_week;
        }
        else{
            System.out.println("Invalid status. Assigning base salary");
        }

        return base_salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
