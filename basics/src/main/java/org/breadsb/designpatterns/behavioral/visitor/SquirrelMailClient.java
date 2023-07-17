package org.breadsb.designpatterns.behavioral.visitor;

public class SquirrelMailClient implements MailClient {
    @Override
    public void sendMail(String[] mailInfo) {
        System.out.println("Squirrel Mail Client: sending mail");
    }

    @Override
    public void receiveMail(String[] mailInfo) {
        System.out.println("Squirrel Mail Client: receiving mail");
    }

    @Override
    public boolean accept(MailClientVisitor visitor) {
        visitor.visit(this);
        return true;
    }
}