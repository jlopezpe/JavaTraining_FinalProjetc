public class FullTime_Teacher extends Person implements Teacher {

    private int experience_years;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
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

        this.name=name;
        this.experience_years=experience_years;
    }

    public void calculate_salary() {

    }
}
