package com.AA.AllPattern.StructuralDesignPattern.Facade.EG1;

public class EmployeeDAO {
    public void insert() {
        System.out.println("EMPLOYEE INSERTED INTO DATABASE");
//        BUSINESS LOGIC
    }

    public void delete() {
        System.out.println("EMPLOYEE DELETED FORM DATABASE");
//        BUSINESS LOGIC
    }

    public void updateByID(String empID) {
        System.out.println("EMPLOYEE WITH EMPID:"+empID +" IS UPDATED");
//        BUSINESS LOGIC
    }
}
