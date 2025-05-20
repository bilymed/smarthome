package com.assignment.appliances;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    @Test
    void shouldStartInOffMode() {
        AirConditioner ac = new AirConditioner("Test");

        assertTrue(ac.getStatus().contains("Off"));
    }

    @Test
    void shouldSetModeToCool() {
        AirConditioner ac = new AirConditioner("Test");

        ac.setMode(ACMode.COOL);

        // Then
        assertTrue(ac.getStatus().contains("Cool"));
    }

    @Test
    void shouldSetModeToHeat() {
        // Given
        AirConditioner ac = new AirConditioner("Test");

        // When
        ac.setMode(ACMode.HEAT);

        // Then
        assertTrue(ac.getStatus().contains("Heat"));
    }

    @Test
    void shouldTurnOff() {
        AirConditioner ac = new AirConditioner("Test");
        ac.setMode(ACMode.HEAT);

        ac.turnOff();

        assertTrue(ac.getStatus().contains("Off"));
    }

    @Test
    void shouldTurnOn() {
        AirConditioner ac = new AirConditioner("Test");
        ac.turnOn();

        assertTrue(ac.getStatus().contains("Cool"));
    }
}
