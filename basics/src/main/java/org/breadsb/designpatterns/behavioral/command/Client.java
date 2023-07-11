package org.breadsb.designpatterns.behavioral.command;

public class Client {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Application app = new Application();
        menu.setCommand("copy", new CopyCommand(app, "Some selected text"));
        menu.executeCommand("copy");

        menu.setCommand("paste", new PasteCommand(app, app.getClipboard()));
        menu.executeCommand("paste");
    }
}