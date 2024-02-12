import java.util.ArrayList;
import java.util.List;

public class Class {

    public String name;
    private String classroom;
    public Teacher teacher;
    List<Student> students= new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    public void show_info(){

        System.out.println("Name: "+this.getName());
        System.out.println("Classroom: "+this.getClassroom());
        System.out.println("Teacher name: "+this.getTeacher());
        System.out.println("List of students: "+this.getStudents());


    }
}

