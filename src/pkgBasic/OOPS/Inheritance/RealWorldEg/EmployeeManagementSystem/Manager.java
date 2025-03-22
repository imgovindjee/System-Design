package pkgBasic.OOPS.Inheritance.RealWorldEg.EmployeeManagementSystem;

public class Manager extends Employee{

    private final double bonus;

    public Manager(String employeeName, double salary, double bonus) {
        super(employeeName, salary);
        this.bonus = bonus;
    }

    public void displayDetails() {
        super.display();
        System.out.println("Bonus: "+bonus);
    }
}
