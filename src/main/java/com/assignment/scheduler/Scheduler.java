package com.assignment.scheduler;

import com.assignment.appliances.Appliance;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Scheduler for system updates.
 * Performs a yearly system update at 1:00 AM on January 1st.
 */
@Component
public class Scheduler {

    private final List<Appliance> appliances;

    public Scheduler(List<Appliance> appliances) {
        this.appliances = appliances;
        System.out.println("System will update on January first at 1:00 AM");
    }

    /**
     * Scheduled to run at 1:00 AM on January first in every year.
     */
    @Scheduled(cron = "0 0 1 1 1 ?")
    public void performUpdate() {
        System.out.println("\n---- SYSTEM UPDATE STARTING ----");
        System.out.println("Current time: " + LocalDateTime.now());

        // Turn off all appliances
        appliances.forEach(Appliance::turnOff);

        System.out.println("Update in progress...");

        try {
            // Shows fake time to complete
            Thread.sleep(5000);
            System.out.println("All devices are turned-off successfully!");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
