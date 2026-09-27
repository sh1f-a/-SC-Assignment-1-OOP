package com.mycompany.scd_assignment_1;

public class SmartThermostat implements SmartDevice {
    private boolean isOn = false;
    private double temperature = 22.0;

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }

    @Override
    public String getStatus() {
        return "SmartThermostat Power: " + (isOn ? "ON" : "OFF") + " | Temp: " + temperature + "°C";
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
    }
}
