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

        if (years_of_experience == 0){
            //If the teacher has 0 years of experience or works 0 hours per week, we only pay them the base salary.
            salary = getBASEPAY();
        }
        else{
            //base salary multiplied by 110% of their experience years
            salary = getBASEPAY() * (1.1 * years_of_experience);
        }

        setSalary(salary);
    }

    public int getYears_of_experience() {
        return years_of_experience;
    }

    public void setYears_of_experience(int years_of_experience) {
        this.years_of_experience = years_of_experience;
    }

    @Override
    public String toString() {
        return "Full Time Teacher";
    }
}
