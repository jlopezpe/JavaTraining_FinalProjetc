import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class {

    public String name;
    private String classroom;
    private Teacher teacher;
    List<Student> students= new ArrayList<>();

    public Class(){

    }

    public Class(String name,String classroom,Teacher teacher){

        this.name=name;
        this.classroom=classroom;
        this.teacher=teacher;

    }
    public Class(String name,String classroom,Teacher teacher,List<Student> list_students){

        this.name=name;
        this.classroom=classroom;
        this.teacher=teacher;
        this.students=list_students;

    }

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


    public void show_classinfo(){

        System.out.println("Name: "+this.getName());
        System.out.println("Classroom: "+this.getClassroom());
        System.out.println("Teacher name: "+this.getTeacher().getName());
        System.out.println("List of students:");
        for(Student student: this.getStudents()){
            System.out.println("________________");
            System.out.println("Name: "+student.getName()+" || "+ " Student_ID: "+student.getId());
        }
        System.out.println("---------------");

    }

    public void add_student(Student student){

        this.getStudents().add(student);
    }

    public void search_student(){
        System.out.println("Write the student id");
        Scanner input=new Scanner(System.in);
        int id_student=input.nextInt();
        for(Student student: this.getStudents()){

            if(student.getId()==id_student){
                System.out.println(this.getName());
            }
        }
    }

    public void show_classroom_only(){

        System.out.println("Classroom: "+this.getClassroom());
        System.out.println("---------------");

    }



}

