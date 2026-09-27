package com.mycompany.scd_assignment_1;

import java.util.ArrayList;
import java.util.List;

public class SCD_Assignment_1 {

    public static void main(String[] args) {
        System.out.println("=== TASK 2: POLYMORPHISM TEST ===");

        // Create a generic list of Employee references
        List<Employee> employees = new ArrayList<>();

        // Add both Developer and SalesManager instances
        employees.add(new Developer("Alice", 80000.0, 5000.0));
        employees.add(new SalesManager("Bob", 60000.0, 15000.0));

        // Polymorphic invocation of calculatePay()
        for (Employee emp : employees) {
            System.out.println("Employee: " + emp.getName() + " | Final Pay: $" + emp.calculatePay());
        }
    }
}