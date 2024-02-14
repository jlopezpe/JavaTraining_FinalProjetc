import static java.lang.Math.round;

public class FullTime_Teacher extends Person implements Teacher {

    private int experience_years;
    private float salary;

    public float getSalary() {
        return calculate_salary();
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getExperience_years() {
        return experience_years;
    }

    public void setExperience_years(int experience_years) {
        this.experience_years = experience_years;
    }

    public FullTime_Teacher(){

    }

    public FullTime_Teacher(String name,int experience_years){

        this.setName(name);
        this.experience_years=experience_years;
    }

    public float calculate_salary() {

        return calculate_salary(this.experience_years);
    }

    public float calculate_salary(int experience_years){

        this.setSalary(round(experience_years*1.1*salary_base));
        return salary;

    }

}
