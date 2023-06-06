class Employee {
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and My name is "+ name);
    }

    public int getsalary(){
        return salary;
    }
}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";

        // Setting Attributes for John
        john.id = 13;
        john.salary = 12;
        john.name = "John Tripathi";

        // Printing the Attributes
        harry.printDetails();
        john.printDetails();
        int salary = john.getsalary();
        System.out.println(salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);

    }
}