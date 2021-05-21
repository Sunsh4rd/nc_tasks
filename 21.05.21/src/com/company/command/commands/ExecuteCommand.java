package com.company.command.commands;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExecuteCommand implements Command {

    private final String fileName = "src/com/company/command/File.txt";
    private int lastAddedLength = 0;

    @Override
    public void execute(String stringToAdd) {
        Path path = Path.of(fileName);
        try {
            Files.writeString(path, stringToAdd);
            lastAddedLength = stringToAdd.length();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void undo() {
        Path path = Path.of(fileName);
        try {
            String text = new String(Files.readAllBytes(path));
            String undo = text.substring(0, text.length() - lastAddedLength);
            execute(undo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
