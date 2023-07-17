package org.breadsb.designpatterns.behavioral.visitor;

public class MacMailClientVisitor implements MailClientVisitor {
    @Override
    public void visit(OperaMailClient client) {
        System.out.println("Configuration of Opera mail client for Mac complete");
    }

    @Override
    public void visit(SquirrelMailClient client) {
        System.out.println("Configuration of Squirrel mail client for Mac complete");
    }
}
