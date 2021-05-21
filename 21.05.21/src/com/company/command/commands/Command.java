package com.company.command.commands;

public interface Command {

    void execute(String stringToAdd);
    void undo();
}
