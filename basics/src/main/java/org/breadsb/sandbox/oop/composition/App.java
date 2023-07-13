package org.breadsb.sandbox.oop.composition;

import java.util.List;

public class App {

    List<Editor> editors;
    Editor activeEditor;

    void executeCommand(Command command) {
        command.execute();
    }
}