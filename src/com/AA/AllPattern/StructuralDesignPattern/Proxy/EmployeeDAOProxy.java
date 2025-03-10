package com.AA.AllPattern.StructuralDesignPattern.Proxy;

import com.AA.AllPattern.StructuralDesignPattern.Proxy.EmployeeDAO.EmployeeDAO;
import com.AA.AllPattern.StructuralDesignPattern.Proxy.EmployeeDAO.EmployeeDAOImplementation;

public class EmployeeDAOProxy implements EmployeeDAO {

    EmployeeDAO employeeDAO;

//    CONSTRUCTOR
    public EmployeeDAOProxy(){
        this.employeeDAO = new EmployeeDAOImplementation();
    }

    @Override
    public void create(String client, EmployeeDAO employeeDAO) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDAO.create(client, employeeDAO);
            return;
        }
        throw new Exception("ACCESSED DENIED");
    }
}
