package com.AA.AllPattern.StructuralDesignPattern.Proxy;


import com.AA.AllPattern.StructuralDesignPattern.Proxy.EmployeeDAO.EmployeeDAO;

public class EmployeeDo {
    EmployeeDAO employeeDAO;
    public EmployeeDo() {
        employeeDAO = new EmployeeDAOProxy();
    }
}
