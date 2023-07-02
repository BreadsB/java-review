package org.breadsb.designpatterns.creational.factory.factories;
import org.breadsb.designpatterns.creational.factory.products.Product;
import org.breadsb.designpatterns.creational.factory.products.Window;

public class WindowFactory implements AbstractFactory {

    @Override
    public Product createProduct() {
        return new Window();
    }
}
