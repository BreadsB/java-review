package org.breadsb.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class DiscountMonitoringSystem implements Subject {
    private List<Observer> observers;
    private Product product;

    public DiscountMonitoringSystem(Product product) {
        this.observers = new ArrayList<>();
        this.product = product;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(product);
        }
        countObservers();
    }

    public void changePrice(double price) {
        product.setPrice(price);
        notifyObservers();
    }

    private void countObservers() {
        int i = observers.size();
        String s;
        if (i == 1) {
            s = "observer was";
        } else {
            s = "observers were";
        }
        System.out.printf("%s %s notified about price change\n", i, s);
    }
}
