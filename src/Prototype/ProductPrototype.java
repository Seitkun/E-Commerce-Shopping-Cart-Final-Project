package Prototype;

import Classes.Product;

public class ProductPrototype extends Product implements Cloneable {
    public ProductPrototype(String name, double price, int stock, String type) {
        super(name, price, stock, type);
    }
    @Override
    public ProductPrototype clone(){
        return new ProductPrototype(this.getName(), this.getPrice(), this.getStock(), this.getType());
    }
}
