// EXAM QS
// Create a class hierarchy with Person as the base class and Employee, Faculty, Staff, and Student as subclasses. Include basic attributes and override toString in each class to display the object type and name.

class Person {   
    String name;
    String address;
    int phoneNo;
    String email;
    public Person(String name, String address, int phoneNo, String email){
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Person: " + name;
    }
}

class Employee extends Person {
    int office;
    int salary;
    public Employee(String name, String address, int phoneNo, String email, int office, int salary){
        super(name, address, phoneNo, email);
        this.office = office;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

class Faculty extends Employee {
    int officeHours;
    int rank;

    public Faculty(String name, String address, int phoneNo, String email, int office, int salary, int officeHours, int rank){
        super(name, address, phoneNo, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + name;
    }
}

class Staff extends Employee {
    String title;

    public Staff(String name, String address, int phoneNo, String email, int office, int salary, String title){
        super(name, address, phoneNo, email, office, salary);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + name;
    }
}

class Student extends Person {
    final String FIRST_YEAR = "first year";
    final String SECOND_YEAR = "second year";
    final String THIRD_YEAR = "third year";
    final String FOURTH_YEAR = "fourth year";

    private final String status;

    public Student(String name, String address, int phoneNo, String email, String status){
        super(name, address, phoneNo, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + status + ")";
    }
}

public class PersonHeirachy {
    public static void main(String[] args){
        Faculty f1 = new Faculty("Ali", "Street 12", 123456, "ali@mail.com", 101, 50000, 40, 1);
        Staff s1 = new Staff("Sara", "Street 7", 654321, "sara@mail.com", 102, 40000, "Manager");
        Student st1 = new Student("Ahmed", "Street 20", 987654, "ahmed@mail.com", "first year");

        System.out.println(f1);
        System.out.println(s1);
        System.out.println(st1);
    }
}
