package org.breadsb.designpatterns.behavioral.mediator.v2;

public class Student {
    int rollNum;
    String studentName;
    //Creating HAS-A relationship with Address class
    Address studentAddr;
    Student(int roll, String name, Address addr){
        this.rollNum=roll;
        this.studentName=name;
        this.studentAddr = addr;
    }

    public static void main(String args[]){
        Address ad = new Address(55, "Agra", "UP", "India");
        Student obj = new Student(123, "Chaitanya", ad);
        System.out.println(obj.rollNum);
        System.out.println(obj.studentName);
        System.out.println(obj.studentAddr.streetNum);
        System.out.println(obj.studentAddr.city);
        System.out.println(obj.studentAddr.state);
        System.out.println(obj.studentAddr.country);
    }
}
