package Classes;
import Decorator.IProduct;
import Decorator.ProductDecorator;
import Observer.*;
import Strategy.DiscountStrategy;

import java.util.ArrayList;
import java.util.List;

public class Cart implements StoreObserver{
    private final List<Product> items = new ArrayList<>();

    public void add(Product product) {
        if (product.getStock() > 0) {
            items.add(product);
            System.out.println(product.getName() + " has been added to the cart");
        } else {
            System.out.println("Out of stock");
        }
    }

    public void remove(int id){
            items.remove(id);
    }

    public void show(){
        System.out.println("Your cart:");
        for(int i=0;i<items.size();i++){
            IProduct p = items.get(i);
            System.out.println((i+1)+") "+p.getName()+" - $"+p.getPrice()+" - stock: "+p.getStock());
        }
    }

    public void applyDiscount(DiscountStrategy discountStrategy) {
        for (IProduct product : items) {
            if(product instanceof Product product1){
                product1.setPrice(discountStrategy.setDiscount(product1.getPrice()));
            }
        }
    }

    public void decorateProduct(int id, Class<? extends ProductDecorator> decoratorClass){
        try {
            IProduct original = items.get(id);
            ProductDecorator decorated = decoratorClass
                    .getConstructor(IProduct.class)
                    .newInstance(original);
            items.set(id, decorated);
            System.out.println("Product " + decorated.getName() + " decorated: " + decorated.makeAction());
        } catch(Exception e){
            System.out.println("Error applying decorator: " + e.getMessage());
        }
    }

    @Override
    public void update(Product product) {
        System.out.println("Cart updated: " + product.getName() + " changed");
    }
}
