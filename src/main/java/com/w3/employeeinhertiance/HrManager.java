package com.w3.employeeinhertiance;

public class HrManager extends  Employee{
    public HrManager(int salary){
        super(salary);

    }
    @Override
    public void work(){
        System.out.println("Mainting Employees");
    }
    public void addNewEmployee(){
        System.out.println("Adding new Employee");
    }
}
