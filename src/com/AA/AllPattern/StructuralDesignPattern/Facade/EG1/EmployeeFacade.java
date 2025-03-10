package com.AA.AllPattern.StructuralDesignPattern.Facade.EG1;

public class EmployeeFacade {
    EmployeeDAO employeeDAO;

    public EmployeeFacade() {
        this.employeeDAO = new EmployeeDAO();
    }

    public void insert() {
        employeeDAO.insert();
    }
}
