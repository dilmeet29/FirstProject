package com.company;

public class Employee {

    private int employeeId;
    private String employeeName;
    private double hourlyRate;
    private double hoursWork;


    public Employee(int employeeId, String employeeName, double hourlyRate, double hoursWork) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.hourlyRate = hourlyRate;
        this.hoursWork = hoursWork;
    }
    public double calculateSalary()
    {
        return 160*hourlyRate;
    }

    public void print()
    {
        System.out.println("Employee name ---> "+ this.employeeName);
        System.out.println("Employee id ---> "+ this.employeeId);
        System.out.println("pay rate  ---> "+ this.hourlyRate);
        System.out.println("total hours work ---> "+ this.hoursWork);

    }
}
