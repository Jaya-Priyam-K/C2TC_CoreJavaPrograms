package entityclassassignment2;

public class Product {
    private int productId;
    private String productName;
    private double price;

    // Constructor
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // toString method for displaying product details
    @Override
    public String toString() {
        return "Product ID: " + productId +
               ", Name: " + productName +
               ", Price: ₹" + price;
    }
}
