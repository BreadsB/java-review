package org.breadsb.sandbox.oop.composition;

public abstract class Command {

    protected App app;
    protected Editor editor;

    public Command(App app, Editor editor) {
        this.editor = editor;
        this.app = app;
    }

    abstract void execute();
}