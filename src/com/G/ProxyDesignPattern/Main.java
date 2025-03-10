package com.G.ProxyDesignPattern;

import com.G.ProxyDesignPattern.EmployeeDAO.EmployeeDAO;

public class Main {
    public static void main(String[] args){
        try {
            EmployeeDAO employeeDAO = new EmployeeDAOProxy();
            employeeDAO.create("ADMIN", (EmployeeDAO) new EmployeeDo());
            System.out.println("Operation Successfully");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
