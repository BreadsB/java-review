package org.breadsb.designpatterns.behavioral.command;

public class CopyCommand implements Command {

    private Application app;
    private String selectedText;

    public CopyCommand(Application app, String selectedText) {
        this.app = app;
        this.selectedText = selectedText;
    }

    @Override
    public void process() {
        System.out.println("Copy command processing...");
        app.setClipboard(selectedText);
    }
}
