package Menu;

import Creators.Teacher;
import Entities.FullTime_Teacher;
import Entities.PartTime_Teacher;
import Entities.Student;
import Entities.Class;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//THIS CLASS HAVE ALL THE MAIN FUNCTIONALITIES ON THE MENU
public class University {

    private List<Teacher> teachers=new ArrayList<>();
    private List<Student> students=new ArrayList<>();
    private List<Class> classes=new ArrayList<>();


    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    //FUNTIONALITY 1
    public void show_professorsInfo(){

        List<Teacher> list_teachers=this.getTeachers();


        System.out.println("This is the list of the teachers working at the moment in the university");
        System.out.println("-------------------------------------------------------");
        for (Teacher teacher : list_teachers) {

            if(teacher instanceof PartTime_Teacher){

                System.out.println("ParTime Creators.Teacher");
                System.out.println("Name: "+teacher.getName());
                System.out.println("Salary: "+((PartTime_Teacher) teacher).getSalary());
                System.out.println("--------------");
            }

            else if (teacher instanceof FullTime_Teacher){
                System.out.println("FullTime Creators.Teacher");
                System.out.println("Name: "+teacher.getName());
                System.out.println("Salary: "+((FullTime_Teacher) teacher).getSalary());
                System.out.println("--------------");


            }

        }
    }

    //Just a current used method in the main functionalities
    public void showinfo_student(){

        List<Student> list_students= this.students;

        System.out.println("This is the list of students ");
        System.out.println("-------------------------------------------------------");
        for(Student student: list_students){

            student.show_studentinfo();
            System.out.println("--------------");
        }

    }

    //FUNCTIONALITY 2
    public void show_classes_menu(List<Class> list_classes){

        System.out.println("This is the list of the classes available");
        for(Class classes: list_classes){

            System.out.println(classes.getName());
        }
        System.out.println("Write the class you are interested in");
        Scanner input=new Scanner(System.in);
        String name_class= input.next();



        for (Class classes : list_classes) {

            if (classes.getName().equals(name_class)) {

                System.out.println("Here is the information of your interest");

                classes.show_classinfo();

                break;
            }

            else {
                if(list_classes.indexOf(classes)==list_classes.size()-1){
                    System.out.println("Please write a correct name class");
                    this.show_classes_menu(list_classes);
                }
            }

        }

    }

    //Just a current used method in the main functionalities
    public void show_classesInfo(){

        System.out.println("This is the list of the classes available");
        for(Class classes: this.getClasses()){
            classes.show_classinfo();
        }

    }

    //FUNCTIONALITY 3
    public void create_student(){

        boolean correct_name=false;
        while(!correct_name){
            System.out.println("Give us the student information");
            System.out.println("Please, write his name");
            Scanner input=new Scanner(System.in);
            String name_student=input.nextLine();

            if(name_student.matches("[a-zA-Z ]+")){
                correct_name=true;
                try {

                    System.out.println("Please, write his age");
                    int age_student = input.nextInt();
                    int id = this.getStudents().size();
                    Student new_student = new Student(id, age_student, name_student);
                    this.add_newEntity(new_student);
                    //Use this other method for assign a class to the new student
                    this.add_studentTo_class(new_student);
                }
                catch (InputMismatchException e){
                    System.out.println("Age incorrect, be sure to type correctly ");
                    this.create_student();
                }
            }
            else{
                System.out.println("ERROR, write a correct name");

            }

        }
    }

    //method for assign a class to a new student
    public void add_studentTo_class(Student new_student){
        Scanner input=new Scanner(System.in);
        System.out.println("Write in which class the student will be");
        System.out.println("-------------------------------------------------");
        for(Class classes: this.getClasses()){

            classes.show_name_only();
        }
        String new_class=input.next();

        for(Class classes: this.getClasses()){

            if(new_class.equals(classes.getName())){
                classes.add_student(new_student);
                System.out.println("Entities.Student created");
                break;
                //take it to the menu, is possible use Menu.Menu function
            }
            else{
                if(this.getClasses().indexOf(classes)==this.getClasses().size()-1){
                    System.out.println("Please write correctly");
                    this.add_studentTo_class(new_student);
                }
            }

        }
    }

    //FUNCTIONALIY 5
    public void search_Studentclass(){
        this.showinfo_student();
        try{
            System.out.println("Please write a correct student id and know in which classes he is");
            Scanner input=new Scanner(System.in);
            int id_student=input.nextInt();
            boolean found=false;
            for(Class classes: this.getClasses()){

                for(Student student: classes.getStudents()){

                    if(student.getId()==id_student){
                        System.out.println(classes.getName());
                        found=true;
                    }

                }
            }
            if(!found){
                System.out.println("NOT ID FOUND,try again");
                this.search_Studentclass();
            }
        }
        catch (InputMismatchException e){
            System.out.println("Incorrect ID,try again");
            this.search_Studentclass();
        }
    }

    //FUNCIONALITY 4
    public void create_class(){

        //Create a new class and add an existing teacher, existing students and its relevant data
        System.out.println("Please give the subject of this class");
        Scanner input=new Scanner(System.in);
        String class_name=input.nextLine();
        System.out.println("In which classroom it will be");
        System.out.println("These classroom are not available, or maybe the class will be in a different schedule");
        for(Class classes: this.getClasses()){

            classes.show_classroom_only();

        }
        String classroom_class=input.nextLine();
        System.out.println("Which teacher will teach this class?");
        this.show_teachers();
        boolean teacher_condition=false;
        String adding_teacher = input.nextLine();
        for(Teacher teacher: this.getTeachers()){
            if(teacher.getName().equals(adding_teacher)){
                System.out.println("Which student will be in this new class?");
                System.out.println("Please write his ID, choose one by one");
                System.out.println("When you finish to add new students, type -1");
                //USING THE CHOOSE_STUDENT METHOD TO ADD STUDENTS TO THE NEW CLASS
                Class new_class=new Class(class_name,classroom_class,teacher,this.choose_student());

                this.add_newEntity(new_class);
                System.out.println("New class created");
                teacher_condition=true;
            }
        }
        if(!teacher_condition){
            System.out.println("Incorrect teacher, please try again");
            this.create_class();
        }
    }

    //Funtion to choose who will be in a new class
    public List<Student> choose_student(){

        this.showinfo_student();
        boolean condition=true;
        //boolean student_condition=false;
        List<Student> new_studentList=new ArrayList<>();
        while(condition==true){
            boolean student_condition=false;
            Scanner input=new Scanner(System.in);
            int id_newStudent=input.nextInt();
            if(id_newStudent==-1){
                condition=false;
            }
            else{
                for(Student new_student: this.getStudents()){

                    if(id_newStudent==new_student.getId()){

                        if(new_studentList.contains(new_student)){
                            System.out.println("This student is already added");

                        }
                        else{
                            new_studentList.add(new_student);
                            System.out.println("Entities.Student added");
                            student_condition = true;
                            break;
                        }
                    }
                }
                if (!student_condition){
                    System.out.println("Incorrect id, please try again");


                }
            }
        }

        return new_studentList;
    }
    public void show_teachers(){
        for(Teacher teacher: this.getTeachers()){
            System.out.println(teacher.getName());
        }
    }

    public void add_newEntity(Teacher teacher){

        this.getTeachers().add(teacher);
    }

    public void add_newEntity(Student student){

        this.getStudents().add(student);

    }

    public void add_newEntity(Class new_class){

        this.getClasses().add(new_class);

    }


}
