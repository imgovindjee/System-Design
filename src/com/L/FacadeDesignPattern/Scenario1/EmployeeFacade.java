package com.L.FacadeDesignPattern.Scenario1;

import com.L.FacadeDesignPattern.Scenario1.Employee;
import com.L.FacadeDesignPattern.Scenario1.EmployeeDAO;

public class EmployeeFacade {
    EmployeeDAO employeeDAO;

    public EmployeeFacade() {
        employeeDAO = new EmployeeDAO();
    }

    public void insert(){
        employeeDAO.insert();
    }

    public Employee getEmployeeDetails(int empID) {
        System.out.println("EmployeeID is "+empID);
        return employeeDAO.getEmployeeDetails(empID);
    }
}
