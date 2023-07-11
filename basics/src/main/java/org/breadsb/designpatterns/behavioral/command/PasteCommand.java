package org.breadsb.designpatterns.behavioral.command;

public class PasteCommand implements Command {

    private Application app;
    private String selectedText;

    public PasteCommand(Application app, String selectedText) {
        this.app = app;
        this.selectedText = selectedText;
    }

    @Override
    public void process() {
        System.out.println("Paste command processing...");
        app.backup();
        app.setClipboard(selectedText);
    }
}
