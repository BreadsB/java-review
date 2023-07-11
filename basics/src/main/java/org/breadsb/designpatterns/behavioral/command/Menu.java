package org.breadsb.designpatterns.behavioral.command;

import java.util.HashMap;
import java.util.Map;

// Sender - sending request to Receiver
public class Menu {
    Map<String, Command> menuItems = new HashMap<>();

    public void setCommand(String operation, Command command) {
        menuItems.put(operation, command);
    }

    public void executeCommand(String operation) {
        menuItems.get(operation).process();
    }
}
