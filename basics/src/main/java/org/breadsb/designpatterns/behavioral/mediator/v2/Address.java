package org.breadsb.designpatterns.behavioral.mediator.v2;

public class Address {
    int streetNum;
    String city;
    String state;
    String country;
    Address(int street, String c, String st, String coun)
    {
        this.streetNum=street;
        this.city =c;
        this.state = st;
        this.country = coun;
    }
}
