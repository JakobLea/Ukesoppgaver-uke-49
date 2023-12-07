package com.example.ukesoppgaveruke49;
import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private static List<Product> products = new ArrayList<>();

    public static void addProduct(String name, double price) {
        Product product = new Product(name, price);
        products.add(product);
    }

    public static List<Product> getProducts() {
        return products;
    }
}
