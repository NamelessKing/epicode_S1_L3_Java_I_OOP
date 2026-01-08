package es3;

public class Product {
    private final String productCode;
    private final String description;
    private final double price;
    private final int stockQuantity;

    public Product(String productCode, String description, double price, int stockQuantity) {
        if (productCode == null || productCode.isBlank()) {
            throw new IllegalArgumentException("productCode cannot be blank");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("description cannot be blank");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("price must be positive");
        }
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("stockQuantity cannot be negative");
        }
        this.productCode = productCode;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                '}';
    }
}

