public class Student extends Person {

    private int id;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(){

    }
    public Student(int id,int age,String name){
        this.age=age;
        this.id=id;
        this.name=name;
    }

    public void show_studeninfo(){

        System.out.println("Name: "+this.getName());
        System.out.println("Age: "+this.getAge());
        System.out.println("ID: "+this.getId());
    }
}
