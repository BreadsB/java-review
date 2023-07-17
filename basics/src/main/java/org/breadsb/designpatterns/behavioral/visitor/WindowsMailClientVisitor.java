package org.breadsb.designpatterns.behavioral.visitor;

public class WindowsMailClientVisitor implements MailClientVisitor {
    @Override
    public void visit(SquirrelMailClient client) {
        System.out.println("Configuration of Squirrel mail client for Windows complete");
    }

    @Override
    public void visit(OperaMailClient client) {
        System.out.println("Configuration of Opera mail client for Windows complete");
    }
}
