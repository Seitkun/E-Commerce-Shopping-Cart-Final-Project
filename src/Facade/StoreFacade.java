package Facade;

import Classes.*;
import Builder.*;
import Strategy.*;

import Prototype.*;

public class StoreFacade {
    private final Store store;
    private final Cart cart;

    public StoreFacade(Store store, Cart cart) {
        this.store=store;
        this.cart=cart;
    }

    public void adminAddProduct(String name, double price, int stock) {
        Product product=new ProductBuilder().setName(name).setPrice(price).setStock(stock).build();
        store.addProduct(product);
    }

    public void userAddToCart(int id){
        cart.add(store.get(id));
    }

    public void applyDiscount(Discounter discounter) {
        cart.applyDiscount(discounter.getStrategy());
    }
    public void cloneProduct(int id){
        ProductPrototype original=new ProductPrototype(
                store.get(id).getName(),
                store.get(id).getPrice(),
                store.get(id).getStock(),
            
                store.get(id).getType()
        );
        store.addProduct(original.clone());
   
 }

}



