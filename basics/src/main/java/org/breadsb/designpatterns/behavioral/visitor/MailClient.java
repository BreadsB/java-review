package org.breadsb.designpatterns.behavioral.visitor;

public interface MailClient {
    void sendMail(String[] mailInfo);
    void receiveMail(String[] mailInfo);
    boolean accept(MailClientVisitor visitor);
}