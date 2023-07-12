package org.breadsb.sandbox.oop.aggregation;

import java.util.List;

public class AggregationClass {

}

// Baeldung
class Wheel {}

class Car {
    List<Wheel> wheels;
}

// JavaTPoint
class Operation {}
class Circle {
    Operation operation;

}

//Geeks 4 Geeks
class Student {}

class Department {
    private List<Student> students;
    Department(String name, List<Student> students)
    {
        this.students = students;
    }
}

// Composition Geeks 4 Geeks
class Book {}

class Library {
    private final List<Book> books;
    Library(List<Book> books) {
        this.books = books;
    }
}