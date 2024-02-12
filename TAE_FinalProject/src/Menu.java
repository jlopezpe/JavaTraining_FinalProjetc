public class Menu {

    //Initialize minimum 2 different teachers of each type (full time, part time).
    //Initialize minimum 6 different students
    //Initialize minimum 4 different classes including its teacher , students and other relevant data


    public static void initialize(University university){

        teachers_creation(university);
    }

    public static void teachers_creation(University university){

        PartTime_Teacher part_time_teacher1= new PartTime_Teacher("Juan Gonzalez",4);
        part_time_teacher1.calculate_salary();
        university.add_newEntity(part_time_teacher1);

        PartTime_Teacher part_time_teacher2= new PartTime_Teacher("Maria Lopez",8);
        part_time_teacher2.calculate_salary();
        university.add_newEntity(part_time_teacher2);

        FullTime_Teacher full_time_teacher1= new FullTime_Teacher("Daniela Garcia",5);
        full_time_teacher1.calculate_salary();
        university.add_newEntity(full_time_teacher1);

        FullTime_Teacher full_time_teacher2= new FullTime_Teacher("Alejandra Jimenez",2);
        full_time_teacher2.calculate_salary();
        university.add_newEntity(full_time_teacher2);

    }

    public void students_creation(){

    }
}
