package org.breadsb.designpatterns.behavioral.memento;

public class EmpMemento {
    private int empId;
    private String empName;
    private String empDesignation;

    public EmpMemento(int empId, String empName, String empDesignation) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }
}