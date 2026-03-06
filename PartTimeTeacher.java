package Java_TAE_Project_1;

public class PartTimeTeacher extends Teacher{
    public PartTimeTeacher(String name, int age, int years_of_experience, int hours_per_week) {
        super(name, age, years_of_experience, hours_per_week);
        calculateSalary(years_of_experience,hours_per_week);
    }

    @Override
    public void calculateSalary(int years_of_experience, int hours_per_week) {
        double salary;

        if ((years_of_experience == 0) || (hours_per_week == 0) ){
            //If the teacher has 0 years of experience or works 0 hours per week, we only pay them the base salary.
            salary = getBASEPAY();
        }
        else{
            //base salary multiplied by the teacher's active hours per week.
            salary = getBASEPAY() * hours_per_week;
        }

        setSalary(salary);
    }
}
