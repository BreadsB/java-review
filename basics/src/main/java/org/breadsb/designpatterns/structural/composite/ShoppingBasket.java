package org.breadsb.designpatterns.structural.composite;

// Client
public class ShoppingBasket {
    public static void main(String[] args) {
        Product phone = new Item("Phone", 799.99);
        Product laptop = new Item("Laptop", 1499.99);

        // Create a composite category
        Category electronics = new Category("Electronics");
        electronics.addProductToCategory(phone);
        electronics.addProductToCategory(laptop);

        // Create another composite category
        Category clothing = new Category("Clothing");
        Product shirt = new Item("Shirt", 29.99);
        clothing.addProductToCategory(shirt);

        // Create the root composite category
        Category root = new Category("Shopping Cart");
        root.addProductToCategory(electronics);
        root.addProductToCategory(clothing);

        // Calculate the total price
        double totalPrice = root.getPrice();
        System.out.println("Total Price: $" + totalPrice);
    }
}
