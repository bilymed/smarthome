package com.assignment.appliances;

/**
 * Represents a light that can be turned on and off.
 */
public class Light implements Appliance {
    private boolean isOn;
    private String name;

    public Light(String name) {
        this.isOn = false;
        this.name = name;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("Light is ON");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("Light is OFF");
    }

    public void toggle() {
        this.isOn = !this.isOn;
        getStatus();
    }

    @Override
    public String getStatus() {
        return name + " light is " + (isOn ? "ON" : "OFF");
    }

    public boolean isOn() {
        return isOn;
    }
}
