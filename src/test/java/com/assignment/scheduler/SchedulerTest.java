package com.assignment.scheduler;

import com.assignment.appliances.Appliance;
import com.assignment.appliances.Light;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

/**
 * Unit tests for the SystemScheduler class.
 */
@SpringBootTest
@Import(TestSchedulerConfig.class)
@ActiveProfiles("test")
class SchedulerTest {

    @Test
    void schedulerShouldTurnOffAllAppliances() {
        Light light = new Light("Test Light");
        light.turnOn();
        List<Appliance> appliances = List.of(light);

        Scheduler scheduler = new Scheduler(appliances);
        scheduler.performUpdate();

        assertFalse(light.isOn());
        assertTrue(light.getStatus().contains("OFF"));
    }
}
