## Smart Home Controller
A simple app to control home devices and do yearly updates.

### Project Design
I used Command design pattern because it fits well with controlling appliances.  
I used simple commands are simple (turn on/off, set mode, speed).  
I used method references like light::turnOn work great.  
I didn't add undo commands to keep things simple.  
I chose Spring Boot because it has a built-in scheduler for the yearly 
updates - the @Scheduled annotation makes timing very efficient.

### Purpose
Controls home devices like lights, fans, and air conditioners  
Turns all devices off for a yearly update at 1:00 AM on January first  
Uses a command-line menu for easy control  
Or Run all tests with maven: mvn test

### Testing
You can test this project in two ways:  
Unit Tests: Check each device and function separately  
Integration Tests: Check that the whole system works together



### Main Features
**Lights:** Turn on/off or toggle  
**Fans:** Set to off, low, or high speed  
**Air Conditioners:** Set to off, on, Set to cool or heat mode  
**Yearly Update:** System updates once a year automatically

