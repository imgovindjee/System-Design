package com.L.FacadeDesignPattern.Scenario1;

public class EmployeeClient {
    public void getEmployeeDetails() {
        EmployeeFacade employeeFacade = new EmployeeFacade();
        Employee employee = employeeFacade.getEmployeeDetails(121122);
//        System.out.println(employee);
    }


//    DRIVE CODE
    public static void main(String[] args) {
        EmployeeClient employeeClient = new EmployeeClient();
        employeeClient.getEmployeeDetails();
    }
}
