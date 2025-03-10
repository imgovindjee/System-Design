package com.AA.AllPattern.StructuralDesignPattern.Proxy;

import com.AA.AllPattern.StructuralDesignPattern.Proxy.EmployeeDAO.EmployeeDAO;

public class Main {
    public static void main(String[] args) {
        try {
            EmployeeDAO employeeDAO = new EmployeeDAOProxy();
            employeeDAO.create("ADMIN", (EmployeeDAO) new EmployeeDo());
            System.out.println("Operation Successful");
        } catch (Exception e) {
            System.out.println("Message is: "+e.getMessage());
        }
    }
}
