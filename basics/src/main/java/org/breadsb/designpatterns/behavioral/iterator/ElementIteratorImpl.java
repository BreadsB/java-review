package org.breadsb.designpatterns.behavioral.iterator;

import java.util.List;

public class ElementIteratorImpl implements ElementIterator {

    public List elementList;
    int position;
    Element element;

    public ElementIteratorImpl(List elementList) {
        this.elementList = elementList;
    }

    @Override
    public Element nextElement() {
        element = (Element) elementList.get(position);
        position++;
        return element;
    }

    @Override
    public boolean isLastElement() {
        if (position < elementList.size()) {
            return false;
        }
        return true;
    }
}
