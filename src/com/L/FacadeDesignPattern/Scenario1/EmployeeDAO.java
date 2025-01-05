package com.L.FacadeDesignPattern.Scenario1;

import com.L.FacadeDesignPattern.Scenario1.Employee;

public class EmployeeDAO {
    public void insert() {
//        insert into DB
    }

    public void updateEmployeeName() {
//        update name of employee in EmployeeTable
    }

    public Employee getEmployeeDetail(String emailID) {
        return new Employee();
    }

    public Employee getEmployeeDetails(int empID) {
        System.out.println("EmployeeID is "+empID);
        return new Employee();
    }
}
