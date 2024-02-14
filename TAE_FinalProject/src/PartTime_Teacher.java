public class PartTime_Teacher extends Person implements Teacher {

    private int hours_week;
    private float salary;

    public int getHours_week() {
        return hours_week;
    }

    public void setHours_week(int hours_week) {
        this.hours_week = hours_week;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public PartTime_Teacher(){

    }

    public PartTime_Teacher(String name,int hours_week){

        this.setName(name);
        this.hours_week=hours_week;

    }

    public float calculate_salary() {

        return calculate_salary(this.hours_week);

    }
    public float calculate_salary(int hours_week) {

        this.setSalary(hours_week*salary_base);
        return salary;

    }


}
