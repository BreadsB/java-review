package org.breadsb.learning_collections;

public class NestedClassesLesson {

    NestedClassesLesson() {
        System.out.println("NestedClasses: Hello world");
    }

    class InnerClass {

        InnerClass() {
            System.out.println("NestedClasses.InnerClass: Hello world");
        }
    }

    static class StaticNestedClass {

        StaticNestedClass() {
            System.out.println("NestedClasses.StaticNestedClass: Hello world");
        }
    }

    public static void main(String[] args) {
        NestedClassesLesson nestedClassesLesson = new NestedClassesLesson();
        NestedClassesLesson.InnerClass innerClass = nestedClassesLesson.new InnerClass();
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        MasterClass masterClass = new MasterClass("Babon");
        System.out.println(masterClass.name + masterClass.number);
    }

    public static class MasterClass {
        protected String name;
        protected int number;

        protected MasterClass(String name) {
            this.name = name;
            this.number = 5;
        }
    }

    public static class CustomClass extends MasterClass {
        public CustomClass(String name) {
            super(name);
            this.number = 7;
        }
    }
}