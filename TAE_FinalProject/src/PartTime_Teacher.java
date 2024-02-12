public class PartTime_Teacher extends Person implements Teacher {

    private int hours_week;
    private double salary;

    public int getHours_week() {
        return hours_week;
    }

    public void setHours_week(int hours_week) {
        this.hours_week = hours_week;
    }

    public double getSalary() {
        return calculate_salary(this.hours_week);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public PartTime_Teacher(){

    }

    public PartTime_Teacher(String name,int hours_week){

        this.setName(name);
        this.setSalary(calculate_salary(hours_week));

    }

    public double calculate_salary() {

        return calculate_salary(this.hours_week);

    }
    public double calculate_salary(int hours_week) {

        this.setSalary(this.getHours_week()*salary_base);
        return salary;

    }


}
