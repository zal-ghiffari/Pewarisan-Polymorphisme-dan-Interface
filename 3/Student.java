public class Student extends Person{
    public Student() {
        //super("SomeName","SomeAdress");
        //super();
        //super.name = "name";
        System.out.println("Inside Student:Constructor");
    }

    public String getName() {
        System.out.println("Student Name : "+name);
        return name;
    }

    public static void main(String[] args) {
        Student anna = new Student();
    }
}