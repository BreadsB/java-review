package org.breadsb.designpatterns.abstractfactory.factories;
import org.breadsb.designpatterns.abstractfactory.products.Product;
import org.breadsb.designpatterns.abstractfactory.products.Window;

public class WindowFactory implements AbstractFactory {

    @Override
    public Product createProduct() {
        return new Window();
    }
}
