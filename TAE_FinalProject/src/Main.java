import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        University university=new University();
        Menu.initialize(university);
        university.show_professorsInfo();

    }
}