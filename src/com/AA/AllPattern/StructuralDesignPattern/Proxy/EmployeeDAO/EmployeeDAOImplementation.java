package com.AA.AllPattern.StructuralDesignPattern.Proxy.EmployeeDAO;

public class EmployeeDAOImplementation implements EmployeeDAO {
    @Override
    public void create(String client, EmployeeDAO employeeDAO) throws Exception {
//        BUSINESS LOGIC
        System.out.println("Created new Employee Object in the Employee Table");
    }
}
