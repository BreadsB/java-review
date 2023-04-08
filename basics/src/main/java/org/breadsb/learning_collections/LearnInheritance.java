package org.breadsb.learning_collections;

class ChildClass extends ParentClass {

    private String message;

    ChildClass(String message) {
        super(message);
    }

    String sayMessageThis() {
        return this.message;
    }

    String sayMessageSuper() {
        return super.sayMessage();
    }
}

class ParentClass {

    private String message;

    ParentClass(String message) {
        this.message = "Parent said hello";
    }

    String sayMessage() {
        return message;
    }
}

public class LearnInheritance {

    public static void main(String[] args) {
        ChildClass cc = new ChildClass("Hello");
        System.out.println(cc.sayMessage());
        System.out.println(cc.sayMessageThis());
        System.out.println(cc.sayMessageSuper());
        ParentClass pc = new ChildClass("Parent");
        System.out.println(pc.sayMessage());
    }
}
