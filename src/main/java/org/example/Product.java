package org.example;

public class Product {
    private int cost;
    private int quantity;
    private String productName;

    public Product(int cost, int quantity, String productName) {
        this.cost = cost;
        this.quantity = quantity;
        this.productName = productName;

    }

    public void totalCost() {
        this.cost = this.cost * this.quantity;
        System.out.println("Total cost: " + this.cost);

    }

    public void printProduct() {
        System.out.println(this.productName + " costs " + this.cost + " and " + this.quantity + " units sold");
    }
}
