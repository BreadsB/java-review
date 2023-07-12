package org.breadsb.designpatterns.behavioral.memento;


import org.junit.jupiter.api.Test;

public class EmpCaretakerTest {

    @Test
    public void testMemento() {
        EmpOriginator empOriginator = new EmpOriginator(100, "James Normand", "Junior Frontend Developer");
        EmpMemento empMemento = empOriginator.saveToMemento();
        EmpCaretaker empCaretaker = new EmpCaretaker();
        empCaretaker.addMemento(empMemento);
        empOriginator.printInfo();

        empOriginator.setEmpDesignation("Project Manager");
        empMemento = empOriginator.saveToMemento();
        empCaretaker.addMemento(empMemento);
        empOriginator.printInfo();

        empMemento = empCaretaker.getMemento();
        empOriginator.undoFromMemento(empMemento);
        empOriginator.printInfo();
    }
}