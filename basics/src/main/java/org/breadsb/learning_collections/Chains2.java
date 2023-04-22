package org.breadsb.learning_collections;

import com.sun.net.httpserver.Filter;

public class Chains2 {

    private class Person {
        String name, lastname, city;
        int age;

        public Person(String inputName, String inputLastName, int inputAge) {
            this.name = inputName;
            this.lastname = inputLastName;
            this.age = inputAge;
            System.out.println("Created new Person");
        }

        public Person(String inputName, String inputLastName, int inputAge, String city) {
            this(inputName, inputLastName, inputAge);
            this.city = city;
            System.out.println("Person with city");
        }

        @Override
        public String toString() {
            return "Person = " + this.name + ", " + this.lastname + ", " + this.age + ", " + this.city;
        }
    }



    private class Employee extends Person {
        int employeeId;

        public Employee(String name, String lastName, int age, int id) {
            super(name, lastName, age);
            this.employeeId = id;
            System.out.println("Created new Employee");
        }

        @Override
        public String toString() {
            return "Employee = " + this.name + ", " + this.lastname + ", " + this.age + ", " + this.employeeId;
        }
    }

    public static void main(String[] args) {
        Chains2 chains = new Chains2();
        Chains2.Employee employee = chains.new Employee("Big", "Brother", 27, 107);
        Chains2.Person person = chains.new Employee("Bratt", "Pitt", 30, 100);
        Chains2.Person person2 = chains.new Person("Robert", "Grass", 45, "Belfast");
        Chains2.Person person3 = chains.new Person("Robert", "Grass", 45);

        System.out.println(employee);
        System.out.println(person);
        System.out.println(person2);
        System.out.println(person3);
    }
}
