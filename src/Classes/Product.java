package Classes;
import Decorator.*;

public class Product implements IProduct{
    private String name;
    private double price;
    private int stock;
    private String type;

    public Product(String name, double price, int stock, String type) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.type = type;
    }

    public Product(String s, double price, int stock) {
        this.name = s;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getStock() {
        return stock;
    }

    public String getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", stock=" + stock + "]";
    }
}
