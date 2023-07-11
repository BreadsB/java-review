package org.breadsb.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ElementAggregateImpl implements ElementAggregate {
    List<Element> elementList;
    public ElementAggregateImpl() {
        elementList = new ArrayList<>();
    }

    @Override
    public void addElement(Element element) {
        elementList.add(element);
    }

    @Override
    public void removeElement(Element element) {
        elementList.remove(element);
    }

    @Override
    public ElementIterator getElementIterator() {
        return new ElementIteratorImpl(elementList);
    }
}
