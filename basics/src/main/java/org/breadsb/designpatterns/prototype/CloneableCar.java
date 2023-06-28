package org.breadsb.designpatterns.prototype;

public interface CloneableCar extends Cloneable {
    CloneableCar cloneShallow();
    CloneableCar cloneDeep();
}
