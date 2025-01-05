package com.G.ProxyDesignPattern;

import com.G.ProxyDesignPattern.EmployeeDAO.EmployeeDAO;

public class EmployeeDo {

    EmployeeDAO employeeDAO;
    public EmployeeDo() {
        employeeDAO = new EmployeeDAOProxy();
    }
}
