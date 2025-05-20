package com.assignment.appliances;

/**
 * Represents a fan that can have different speeds.
 */
public class Fan implements Appliance {
    private FanSpeed currentSpeed;
    private String name;

    public Fan(String name) {
        this.currentSpeed = FanSpeed.OFF;
        this.name = name;
    }

    @Override
    public void turnOn() {
        if (this.currentSpeed == FanSpeed.OFF){
            setSpeed(FanSpeed.LOW);
        } else {
            System.out.println("Speed is already on at " + this.currentSpeed.getDescription());
        }
    }

    @Override
    public void turnOff() {
        setSpeed(FanSpeed.OFF);
    }

    @Override
    public String getStatus() {
        return name + " fan is " + currentSpeed.getDescription();
    }

    public void setSpeed(FanSpeed newSpeed) {
        if (newSpeed == null){
            System.out.println("Speed cannot be null");
            return;
        }
        this.currentSpeed = newSpeed;
        System.out.println("speed set to " + this.currentSpeed.getDescription());
    }

    public FanSpeed getSpeed() {
        return currentSpeed;
    }


}
