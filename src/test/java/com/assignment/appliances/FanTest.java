package com.assignment.appliances;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FanTest {

    @Test
    void shouldStartWithOffSpeed() {
        Fan fan = new Fan("Test");

        assertTrue(fan.getStatus().contains("off"));
    }

    @Test
    void shouldSetSpeedToLow() {
        Fan fan = new Fan("Test");
        fan.setSpeed(FanSpeed.LOW);

        assertTrue(fan.getStatus().contains("low speed"));
    }

    @Test
    void shouldSetSpeedToHigh() {
        Fan fan = new Fan("Test");
        fan.setSpeed(FanSpeed.HIGH);

        assertTrue(fan.getStatus().contains("High speed"));
    }

    @Test
    void shouldTurnOff() {
        Fan fan = new Fan("Test");
        fan.setSpeed(FanSpeed.HIGH);
        fan.turnOff();

        assertTrue(fan.getStatus().contains("off"));
    }
}