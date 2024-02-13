public class Main {
    public static void main(String[] args) {

        University university=new University();
        Setup.initialize(university);
        //university.show_professorsInfo();
        //university.showinfo_student();
        //university.show_classesInfo(university.getClasses());
        university.show_classes_menu(university.getClasses());
        university.create_student();

    }

}