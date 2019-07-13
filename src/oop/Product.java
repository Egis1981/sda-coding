package oop;

public class Product {
    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    private String name;
    private float price;

    public String toString() {      //atsiminti galima naudoti visos klasese
        return String.format("%s - %.2f EUR", name, price);
    }
}