package com.assignment.appliances.console;

import com.assignment.appliances.*;
import com.assignment.command.RemoteControl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class SmartHomeController implements CommandLineRunner {

    private final Light livingRoomLight = new Light("Living Room Light");
    private final Fan kitchenFan = new Fan("Kitchen Fan");
    private final AirConditioner bedroomAC = new AirConditioner("Bedroom AirConditioner");
    private final RemoteControl remote = new RemoteControl();

    @Override
    public void run(String... args) throws Exception {

        var scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. " + livingRoomLight.getStatus());
            System.out.println("2. " + kitchenFan.getStatus());
            System.out.println("3. " + bedroomAC.getStatus());
            System.out.println("0. Exit");

            System.out.println("\n --- Enter your choice: ---");
            var choice = -1;
            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                try {
                    choice = Integer.parseInt(line);
                    switch (choice) {
                        case 0:
                            running = false;
                            System.out.println("Exiting Smart Home Controller.");
                            break;
                        case 1:
                            System.out.println("Light control: 1. Turn ON, 2. Turn OFF");
                            System.out.print("Enter your choice: ");
                            int lightChoice = scanner.nextInt();
                            switch (lightChoice) {
                                case 1:
                                    remote.setCommand(livingRoomLight::turnOn);
                                    break;
                                case 2:
                                    remote.setCommand(livingRoomLight::turnOff);
                            }
                            break;
                        case 2:
                            System.out.println("Fan control: 1. Turn ON, 2. Turn OFF, 3. High speed");
                            System.out.print("Enter your choice: ");
                            int fanChoice = scanner.nextInt();
                            switch (fanChoice) {
                                case 1:
                                    remote.setCommand(kitchenFan::turnOn);
                                    break;
                                case 2:
                                    remote.setCommand(kitchenFan::turnOff);
                                    break;
                                case 3:
                                    remote.setCommand(() -> kitchenFan.setSpeed(FanSpeed.HIGH));
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                            }
                            break;
                        case 3:
                            System.out.println("AC control: 1. Turn ON, 2. Turn OFF, 3. Heat Mode");
                            System.out.print("Enter your choice: ");
                            int acChoice = scanner.nextInt();
                            switch (acChoice) {
                                case 1:
                                    remote.setCommand(bedroomAC::turnOn);
                                    break;
                                case 2:
                                    remote.setCommand(bedroomAC::turnOff);
                                    break;
                                case 3:
                                    remote.setCommand(() -> bedroomAC.setMode(ACMode.HEAT));
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                            }
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Invalid input: '" + line + "'. Please enter a number.");
                }
            }
        }
        scanner.close();
        System.exit(0);
    }
}