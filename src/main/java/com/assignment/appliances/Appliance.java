package com.assignment.appliances;
/**
 * Common interface for all devices.
 */
public interface Appliance {

    /**
     * Turns the appliance on.
     * turnOn behavior is based on the appliance type.
     */
    void turnOn();

    /**
     * Turns the appliance off.
     * turnOff behavior is based on the appliance type.
     */
    void turnOff();

    String getStatus();
}
