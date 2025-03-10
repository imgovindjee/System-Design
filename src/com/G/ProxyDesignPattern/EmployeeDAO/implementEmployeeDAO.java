package com.G.ProxyDesignPattern.EmployeeDAO;

public class implementEmployeeDAO implements EmployeeDAO{
    @Override
    public void create(String client, EmployeeDAO employeeDAO) throws Exception {
        System.out.println("Created new Employee Object in the Employee Table");
    }

    @Override
    public void delete(String client, int employeeID) throws Exception {
        System.out.println("Deleted a row From the Employee table with EMPLOYEE_ID:- "+employeeID);
    }

    @Override
    public EmployeeDAO get(String client, int employeeID) throws Exception {
        System.out.println("Data fetched from the DB");
        return null;
    }
}
