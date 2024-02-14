import java.util.Scanner;

public class Menu {

    public static void Begin(){
        System.out.println("------------------------");
        System.out.println("||Welcome to Globant University||");
        System.out.println("------------------------");
        University university=new University();
        Setup.initialize(university);
        Menu.menuStep(university);

    }

    public static void menuStep(University university) {
        //System.out.println("What do you want to do?");
        System.out.println("#######################");
        System.out.println("Type 1: To Show the teachers information");
        System.out.println("Type 2: To Show information about a specific class");
        System.out.println("Type 3: To Create a new student");
        System.out.println("Type 4: To Create a new class");
        System.out.println("Type 5: To show the classes in which a student participates");
        System.out.println("Type 6: Exit");
        Scanner input=new Scanner(System.in);

        int option= input.nextInt();
        while(option!=6){

            switch (option){

                case 1: university.show_professorsInfo();
                        menuStep(university);

                case 2: university.show_classes_menu(university.getClasses());
                        menuStep(university);

                case 3: university.create_student();
                        menuStep(university);

                case 4: university.create_class();
                        menuStep(university);

                case 5: university.search_Studentclass();
                        menuStep(university);

                case 6: System.exit(0);


                default:System.out.println("Type a correct option");
                        menuStep(university);

            }

        }
    }
}
