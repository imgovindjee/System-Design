package com.G.ProxyDesignPattern;

import com.G.ProxyDesignPattern.EmployeeDAO.EmployeeDAO;
import com.G.ProxyDesignPattern.EmployeeDAO.implementEmployeeDAO;

public class EmployeeDAOProxy implements EmployeeDAO {

    EmployeeDAO employeeDAO;
    public EmployeeDAOProxy(){
        employeeDAO = new implementEmployeeDAO();
    }

    @Override
    public void create(String client, EmployeeDAO employeeDAO) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDAO.create(client, employeeDAO);
            return;
        }
        throw new Exception("ACCESS DENIED");
    }

    @Override
    public void delete(String client, int employeeID) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDAO.delete(client, employeeID);
            return;
        }
        throw new Exception("ACCESS DENIED");
    }

    @Override
    public EmployeeDAO get(String client, int employeeID) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")) {
            return employeeDAO.get(client, employeeID);
        }
        throw new Exception("ACCESS DENIED");
    }
}
