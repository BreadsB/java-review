package org.breadsb.designpatterns.behavioral.visitor;

public interface MailClientVisitor {
    void visit(OperaMailClient client);
    void visit(SquirrelMailClient client);
}