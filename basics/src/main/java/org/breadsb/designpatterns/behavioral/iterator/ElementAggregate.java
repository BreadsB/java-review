package org.breadsb.designpatterns.behavioral.iterator;

public interface ElementAggregate {
    void addElement(Element element);
    void removeElement(Element element);
    ElementIterator getElementIterator();
}
