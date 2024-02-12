import java.util.ArrayList;
import java.util.List;

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

    public void show_professorsInfo(List<Teacher> list_teachers){


    }
    public void show_classes(){

    }

    public void create_student(){

    }

    public void create_class(){

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
