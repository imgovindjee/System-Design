package pkgBasic.OOPS.Encapuslation.Eg2;

public class Main {
    public static void main(String[] args) {
            Employee employee = new Employee();
            employee.setEmployeeID("E1");
            employee.setName("PRIYANKA");
            employee.setAge(13);
            System.out.println("Employee Name: " + employee.getName());
            employee.setAge(19);
            System.out.println("Employee Age: " + employee.getAge());
    }
}
