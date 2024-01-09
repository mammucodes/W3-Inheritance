package com.w3.employeeinhertiance;

public class Employee {
    int salary;
    public Employee(int salary){
        this.salary = salary;
    }
    //this function prints "" for this employee
    public void work(){
        System.out.println("working as employee");
    }
    //this instance method returns salary
    public int getSalary(){
   return this.salary;
    }

    public static void main(String[] args) {
        System.out.println("working as employee");
        System.out.print("======");
    }
}
