package com.company.command.commands;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    private final List<Command> commands = new ArrayList<>();

    public void executeCommand(Command command, String write) {
        commands.add(command);
        command.execute(write);
    }

    public void undoCommand() {
        Command command = commands.get(commands.size() - 1);
        command.undo();
        commands.remove(command);
    }
}
