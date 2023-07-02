package org.breadsb.designpatterns.creational.prototype;

public interface CloneableCar extends Cloneable {
    CloneableCar cloneShallow();
    CloneableCar cloneDeep();
}
