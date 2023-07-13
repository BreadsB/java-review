package org.breadsb.sandbox.oop.composition;

public abstract class Editor {
    public String text;

    public void getSelection() {}
    public void deleteSelection() {}
    public void replaceSelection(String text) {}

    private void executeCommand(Command cmd) {
        cmd.execute();
    }

    abstract void execute();
}