package com.assignment.command;

/**
 * Command Functional Interface
 * Or we can simply pass Runnable as parameter to RemoteControl setCommand()
 * (for simplicity I used a FunctionalInterface, in real cases it should have undo command
 */
@FunctionalInterface
public interface Command {

    void setCommand();
}
