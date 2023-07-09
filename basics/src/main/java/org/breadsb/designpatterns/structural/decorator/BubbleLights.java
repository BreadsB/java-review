package org.breadsb.designpatterns.structural.decorator;

public class BubbleLights extends TreeDecorator {
    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBubbles();
    }

    private String decorateWithBubbles() {
        return " with Light Bubbles";
    }
}
