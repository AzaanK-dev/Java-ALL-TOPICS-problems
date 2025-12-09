// Create an Employee salary increment calculator that stores an employee’s name and salary, and write a method that increases the salary based on performance percentage using given criteria.

class Employee {
    String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void increaseSalary(double percent) {
        if (percent >= 85)
            salary += salary * 25 / 100;
        else if (percent >= 80)
            salary += salary * 15 / 100;
        else if (percent >= 70)
            salary += salary * 10 / 100;
        else
            System.out.println("Less performance then reguired criteria!");
        System.out.println("Current Salary: " + salary);
    }

}
public class EpmloyeeSalaryIncrement {
    public static void main(String[] args) {
        Employee ali = new Employee("Ali", 42000);
        ali.increaseSalary(85);
    }
}