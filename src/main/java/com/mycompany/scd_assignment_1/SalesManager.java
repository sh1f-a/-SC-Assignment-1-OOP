package com.mycompany.scd_assignment_1;

public class SalesManager extends Employee {
    private double salesCommission;

    public SalesManager(String name, double baseSalary, double salesCommission) {
        super(name, baseSalary);
        this.salesCommission = salesCommission;
    }

    @Override
    public double calculatePay() {
        return baseSalary + salesCommission;
    }
}
