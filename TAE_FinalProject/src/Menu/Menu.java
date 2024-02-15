package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void Begin(){
        System.out.println("----------------------------------");
        System.out.println("||Welcome to Globant Menu.University||");
        System.out.println("----------------------------------");
        University university=new University();
        //Creating and adding entities to the new university
        Setup.initialize(university);
        //initiate the menu
        Menu.menuStep(university);

    }

    public static void menuStep(University university) {

        try {
            Scanner input = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("######################################");
                System.out.println("Type 1: To Show the teachers information");
                System.out.println("Type 2: To Show information about a specific class");
                System.out.println("Type 3: To Create a new student");
                System.out.println("Type 4: To Create a new class");
                System.out.println("Type 5: To show the classes in which a student participates");
                System.out.println("Type 6: Exit");
                int option = input.nextInt();
                switch (option) {

                    case 1:
                        university.show_professorsInfo();
                        break;
                    //menuStep(university);

                    case 2:
                        university.show_classes_menu(university.getClasses());
                        break;
                    //menuStep(university);

                    case 3:
                        university.create_student();
                        break;
                    //menuStep(university);

                    case 4:
                        university.create_class();
                        break;
                    //menuStep(university);

                    case 5:
                        university.search_Studentclass();
                        break;
                    //menuStep(university);

                    case 6:
                        System.out.println("|-----------------------------------------|");
                        System.out.println("|¡Thank you for using our app. Take care! |");
                        System.out.println("|-----------------------------------------|");
                        running = false;
                        break;
                    //System.exit(0);


                    default:
                        System.out.println("Type a correct option");
                        //menuStep(university);

                }

            }
        }
        catch (InputMismatchException e){

            System.out.println("Please, type a correct option");
            Menu.menuStep(university);

        }
    }
}
