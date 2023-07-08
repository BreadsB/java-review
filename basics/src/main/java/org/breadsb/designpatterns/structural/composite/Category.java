package org.breadsb.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Composite
public class Category implements Product {

    private String name;
    private List<Product> productsList;

    public Category(String name) {
        this.name = name;
        this.productsList = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double totalPrice = 0.0;
        for (Product product : productsList) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void addProductToCategory(Product product) {
        productsList.add(product);
    }

    public void removeProductFromCategory(Product product) {
        if (productsList.contains(product)) {
            productsList.remove(product);
        } else {
            System.out.println("Theres no such product in basket");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) && Objects.equals(productsList, category.productsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, productsList);
    }

    @Override
    public String toString() {
        return "Category: " + name + '\n' +
                "Products in category: " + productsList +
                '}';
    }
}
