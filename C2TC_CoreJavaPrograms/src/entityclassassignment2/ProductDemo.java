package entityclassassignment2;

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product(201, "Laptop", 55000.00);
        Product p2 = new Product(202, "Smartphone", 18000.50);
        Product p3 = new Product(203, "Tablet", 12000.75);
        Product p4 = new Product(204, "Smartwatch", 3500.99);

        System.out.println("Product 1: " + p1);
        System.out.println("Product 2: " + p2);
        System.out.println("Product 3: " + p3);
        System.out.println("Product 4: " + p4);
    }
}
