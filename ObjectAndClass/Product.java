package BasicsOfJava.ObjectAndClass;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public void displayDetail() {
        System.out.println("Product: " + name + ", Price: " + price);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 120000);
        product1.displayDetail();

        Product product2 = new Product("Smartphone", 10000);
        product2.displayDetail();
    }


}
