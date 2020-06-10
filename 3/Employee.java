public class Employee extends Person{
    public String getName() {
        System.out.println("Employee Name : "+name);
        return name;
    }

    public static void main(String[] args) {
        Person ref;
        Student studentObject = new Student();
        Employee employeeObject = new Employee();

        ref = studentObject;

        String temp = ref.getName();
        System.out.println(temp);

        ref = employeeObject;

        temp = ref.getName();
        System.out.println(temp);
    }
}