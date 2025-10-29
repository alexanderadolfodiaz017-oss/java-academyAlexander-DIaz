package com.Hotel;

public class Employee {

    // Private variables
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // Constructor
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // Derived getters (to complete later)
    public double getTotalPay() {
        // Placeholder: logic will go here later
        return 0.0;
    }

    public double getRegularHours() {
        // Placeholder
        return 0.0;
    }

    public double getOvertimeHours() {
        // Placeholder
        return 0.0;
    }
}
