package Java_TAE_Project_1;

public class FullTimeTeacher extends Teacher{

    private int years_of_experience;

    public FullTimeTeacher(String name, int age, int years_of_experience) {
        super(name, age);
        calculateSalary();
    }

    @Override
    public void calculateSalary() {
        double salary;

        if (getYearsOfExperience() == 0){
            //If the teacher has 0 years of experience or works 0 hours per week, we only pay them the base salary.
            salary = getBasePay();
        }
        else{
            //base salary multiplied by 110% of their experience years
            salary = getBasePay() * (1.1 * getYearsOfExperience());
        }

        setSalary(salary);
    }

    public int getYearsOfExperience() {
        return this.years_of_experience;
    }

    public void setYearsOfExperience(int years_of_experience) {
        this.years_of_experience = years_of_experience;
    }

    @Override
    public String toString() {
        return "Full Time Teacher";
    }
}
