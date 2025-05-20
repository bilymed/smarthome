package com.assignment.appliances;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Light class.
 */
class LightTest {

    @Test
    void shouldStartInOffState() {
        Light light = new Light("Test");
        assertTrue(light.getStatus().contains("OFF"));
    }

    @Test
    void shouldTurnOn() {
        Light light = new Light("Test");
        light.turnOn();
        assertTrue(light.getStatus().contains("ON"));
    }

    @Test
    void shouldTurnOff() {
        Light light = new Light("Test");
        light.turnOn();
        light.turnOff();
        assertTrue(light.getStatus().contains("OFF"));
    }

    @Test
    void shouldToggleBetweenOnAndOff() {
        Light light = new Light("Test");
        assertFalse(light.isOn());
        light.toggle();
        assertTrue(light.getStatus().contains("ON"));
    }

    @Test
    void shouldShowCorrectName() {
        String name = "Living Room";
        Light light = new Light(name);
        assertTrue(light.getStatus().contains(name));
    }
}