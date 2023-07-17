package org.breadsb.designpatterns.behavioral.visitor;

public class OperaMailClient implements MailClient {
    @Override
    public void sendMail(String[] mailInfo) {
        System.out.println("Opera Mail Client: Sending mail");
    }

    @Override
    public void receiveMail(String[] mailInfo) {
        System.out.println("Opera Mail Client: Receiving mail");
    }

    @Override
    public boolean accept(MailClientVisitor visitor) {
        visitor.visit(this);
        return true;
    }
}