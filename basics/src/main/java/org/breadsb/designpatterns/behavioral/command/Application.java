package org.breadsb.designpatterns.behavioral.command;

//Receiver
public class Application {
    private String clipboard;
    private String backup;

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

    public void backup() {
        backup = clipboard;
    }
}
