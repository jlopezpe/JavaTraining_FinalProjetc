import java.util.List;

public class Setup {

    //Initialize minimum 2 different teachers of each type (full time, part time).
    //Initialize minimum 6 different students
    //Initialize minimum 4 different classes including its teacher , students and other relevant data


    public static void initialize(University university){


        teachers_creation(university);
        students_creation(university);
        classes_creation(university);
    }

    public static void teachers_creation(University university){

        //usar metodo de crear clases aquí

        PartTime_Teacher part_time_teacher1= new PartTime_Teacher("Juan Gonzalez",4);
        part_time_teacher1.calculate_salary();
        university.add_newEntity(part_time_teacher1);
        //añadirlo a una clase

        PartTime_Teacher part_time_teacher2= new PartTime_Teacher("Maria Lopez",8);
        part_time_teacher2.calculate_salary();
        university.add_newEntity(part_time_teacher2);
        //añadirlo a una clase

        FullTime_Teacher full_time_teacher1= new FullTime_Teacher("Daniela Garcia",10);
        full_time_teacher1.calculate_salary();
        university.add_newEntity(full_time_teacher1);
        //añadirlo a una clase

        FullTime_Teacher full_time_teacher2= new FullTime_Teacher("Alejandra Jimenez",5);
        full_time_teacher2.calculate_salary();
        university.add_newEntity(full_time_teacher2);
        //añadirlo a una clase

    }

    public static void students_creation(University university){

        Student studen1= new Student(0,20,"Santiago Jaramillo");
        university.add_newEntity(studen1);
        //añadirlo a la lista de una clase también

        Student studen2= new Student(1,23,"Maria Vidal");
        university.add_newEntity(studen2);

        Student studen3= new Student(2,21,"Santiago Jaramillo");
        university.add_newEntity(studen3);

        Student studen4= new Student(3,25,"Lucía Soto");
        university.add_newEntity(studen4);

        Student studen5= new Student(4,22,"Jorge Higuita");
        university.add_newEntity(studen5);

        Student studen6= new Student(5,19,"Ximena Giraldo");
        university.add_newEntity(studen6);

        Student studen7= new Student(6,20,"Laura Bedoya");
        university.add_newEntity(studen7);




    }

    public static void classes_creation(University university){

        Class history=new Class("history","101",university.getTeachers().get(0));
        history.getStudents().add(university.getStudents().get(0));
        history.getStudents().add(university.getStudents().get(4));
        history.getStudents().add(university.getStudents().get(2));
        university.add_newEntity(history);


        Class maths=new Class("maths","205",university.getTeachers().get(3));
        maths.getStudents().add(university.getStudents().get(1));
        maths.getStudents().add(university.getStudents().get(5));
        maths.getStudents().add(university.getStudents().get(3));
        university.add_newEntity(maths);



        Class geography=new Class("geography","103",university.getTeachers().get(1));
        geography.getStudents().add(university.getStudents().get(0));
        geography.getStudents().add(university.getStudents().get(2));
        geography.getStudents().add(university.getStudents().get(6));
        university.add_newEntity(geography);



        Class science=new Class("science","202",university.getTeachers().get(2));
        science.getStudents().add(university.getStudents().get(1));
        science.getStudents().add(university.getStudents().get(4));
        science.getStudents().add(university.getStudents().get(6));
        university.add_newEntity(science);



    }
}
