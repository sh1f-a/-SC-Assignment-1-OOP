package com.mycompany.scd_assignment_1;

public class SmartBulb implements SmartDevice {
    private boolean isOn = false;
    private int brightness = 100;

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
        return "SmartBulb Power: " + (isOn ? "ON" : "OFF") + " | Brightness: " + brightness + "%";
    }

    public void setBrightness(int level) {
        this.brightness = level;
    }
}
