package es3;

import java.util.Arrays;

public class Cart {
    private final Customer customer;
    private final Product[] products;
    private int nextIndex = 0;

    public Cart(Customer customer, int capacity) {
        if (customer == null) {
            throw new IllegalArgumentException("customer cannot be null");
        }
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity must be positive");
        }
        this.customer = customer;
        this.products = new Product[capacity];
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product[] getProducts() {
        return Arrays.copyOf(products, products.length);
    }

    public boolean addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("product cannot be null");
        }
        if (nextIndex >= products.length) {
            return false; // cart full
        }
        products[nextIndex++] = product;
        return true;
    }

    public double getTotalCost() {
        double total = 0;
        for (int i = 0; i < nextIndex; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "customer=" + customer +
                ", products=" + Arrays.toString(getProducts()) +
                ", totalCost=" + getTotalCost() +
                '}';
    }
}

