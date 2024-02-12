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
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void calculate_salary() {

    }
}
