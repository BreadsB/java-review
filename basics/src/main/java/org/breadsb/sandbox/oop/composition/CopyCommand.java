package org.breadsb.sandbox.oop.composition;

public class CopyCommand extends Command {
    public CopyCommand(App app, Editor editor) {
        super(app, editor);
    }

    @Override
    void execute() {
        editor.getSelection();
    }
}