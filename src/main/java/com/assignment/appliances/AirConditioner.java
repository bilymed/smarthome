package com.assignment.appliances;

/**
 * Represents an air conditioner that can be in different modes.
 */
public class AirConditioner implements Appliance {
    private ACMode currentMode;
    private String name;

    public AirConditioner(String name){
        this.currentMode = ACMode.OFF;
        this.name = name;
        System.out.println("AirConditioner created and Initially " + this.currentMode);
    }

    @Override
    public void turnOn() {
        if (this.currentMode == ACMode.OFF){
            setMode(ACMode.COOL);
        } else {
            System.out.println("AirConditioner is already on in mode " + this.currentMode.getDisplayName());
        }
    }

    @Override
    public void turnOff() {
        setMode(ACMode.OFF);
    }

    public void setMode(ACMode newMode) {
        if (newMode == null){
            System.out.println("Mode cannot be null");
            return;
        }
        this.currentMode = newMode;
        System.out.println("Mode set to " + this.currentMode.getDisplayName());
    }

    @Override
    public String getStatus() {
        return name + "AC is in " + currentMode.getDisplayName() + " Mode";
    }
}
