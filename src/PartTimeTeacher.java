package Java_TAE_Project_1.src;

public class PartTimeTeacher extends Teacher {

    private int hours_per_week;

    public PartTimeTeacher(String name, int age, int hours_per_week) {
        super(name, age);
        this.hours_per_week = hours_per_week;

        calculateSalary();
    }

    @Override
    public void calculateSalary() {
        double salary;

        if (getHoursPerWeek() == 0){
            //If the teacher has 0 years of experience or works 0 hours per week, we only pay them the base salary.
            salary = getBasePay();
        }
        else{
            //base salary multiplied by the teacher's active hours per week.
            salary = getBasePay() * getHoursPerWeek();
        }

        setSalary(salary);
    }

    public int getHoursPerWeek() {
        return hours_per_week;
    }

    public void setHoursPerWeek(int hours_per_week) {
        this.hours_per_week = hours_per_week;
    }

    @Override
    public String toString() {
        return "Part Time Teacher";
    }
}
