package org.breadsb.sandbox.oop.composition;

public class PasteCommand extends Command {
    public PasteCommand(App app, Editor editor) {
        super(app, editor);
    }

    @Override
    void execute() {
        System.out.println("Paste command");
    }
}