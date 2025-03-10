package com.G.ProxyDesignPattern.EmployeeDAO;

public interface EmployeeDAO {
    public void create(String client, EmployeeDAO employeeDAO) throws Exception;
    public void delete(String client, int employeeID) throws Exception;
    public EmployeeDAO get(String client, int employeeID) throws Exception;
}
