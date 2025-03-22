package pkgBasic.OOPS.Inheritance.RealWorldEg.EmployeeManagementSystem;

public class Employee {

    private String employeeName;
    private double salary;

    public Employee(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee: "+employeeName+", salary: "+salary);
    }
}
