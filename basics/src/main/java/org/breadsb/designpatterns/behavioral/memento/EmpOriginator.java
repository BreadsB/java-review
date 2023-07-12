package org.breadsb.designpatterns.behavioral.memento;

public class EmpOriginator {
    private int empId;
    private String empName;
    private String empDesignation;

    public EmpOriginator(int empId, String empName, String empDesignation) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
    }

    public EmpMemento saveToMemento() {
        return new EmpMemento(this.empId, this.empName, this.empDesignation);
    }

    public void undoFromMemento(EmpMemento empMemento) {
        this.empId = empMemento.getEmpId();
        this.empName = empMemento.getEmpName();
        this.empDesignation = empMemento.getEmpDesignation();
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public void printInfo() {
        System.out.println("Employee: " + empName + ", " + empDesignation);
    }
}