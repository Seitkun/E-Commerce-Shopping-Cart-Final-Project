package Decorator;

import Classes.Product;

public abstract class ProductDecorator extends Product {
    protected IProduct product;
    public ProductDecorator(IProduct product) {
        super(product.getName(), product.getPrice(), product.getStock(), product instanceof Product p ? p.getType() : "unknown");
        this.product = product;
    }
    public String makeAction(){
        return " ";
    }
}
