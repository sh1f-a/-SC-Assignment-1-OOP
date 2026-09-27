package com.mycompany.scd_assignment_1;

public class task3test {

    public static void main(String[] args) {
        System.out.println("=== TASK 3: DESIGN BY CONTRACT (SMART DEVICES) ===");

        // Interface polymorphic references to concrete device objects
        SmartDevice bulb = new SmartBulb();
        SmartDevice thermostat = new SmartThermostat();

        bulb.turnOn();
        thermostat.turnOn();

        System.out.println(bulb.getStatus());
        System.out.println(thermostat.getStatus());
    }
}
