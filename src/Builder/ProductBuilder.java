package Builder;

import Classes.*;

public class ProductBuilder {
    private String name;
    private double price;
    private int stock;
    private String type;

    public ProductBuilder setName(String name) {
        this.name=name;
        return this;
    }
    public ProductBuilder setPrice(double price) {
        this.price=price;
        return this;
    }
    public ProductBuilder setStock(int stock) {
        this.stock=stock;
        return this;
    }
    public ProductBuilder setType(String type) {
        this.type=type;
        return this;
    }
    public Product build() {
        return new Product(name, price, stock, type);
    }
}

