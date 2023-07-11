package org.breadsb.designpatterns.behavioral.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest {

    @Test
    void testIteratorPattern() {
        Element element1 = new Element("element1", "GroupA");
        Element element2 = new Element("element2", "GroupA");
        Element element3 = new Element("element3", "GroupB");
        Element element4 = new Element("element4", "GroupC");
        Element element5 = new Element("element5", "GroupC");

        ElementAggregate elementAggregate = new ElementAggregateImpl();
        elementAggregate.addElement(element1);
        elementAggregate.addElement(element2);
        elementAggregate.addElement(element3);
        elementAggregate.addElement(element4);
        elementAggregate.addElement(element5);

        List<Element> resultList = showElements(elementAggregate);
        Assertions.assertEquals(5, resultList.size());
    }

    public List<Element> showElements(ElementAggregate elementAggregate) {
        ElementIterator elementIterator = elementAggregate.getElementIterator();
        Element element;
        List<Element> tempElementList = new ArrayList<>();

        while(!elementIterator.isLastElement()) {
            element = elementIterator.nextElement();
            tempElementList.add(element);
        }

        return tempElementList;
    }
}
