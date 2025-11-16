package Classes;

import Observer.*;

import java.util.ArrayList;
import java.util.List;

public class Store extends StoreSubject {
    private final List<Product> products=new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        notifyObservers(product);
    }

    public void changePrice(int id, double newPrice) {
        Product product=products.get(id);
        product.setPrice(newPrice);
        notifyObservers(product);
    }

    public void changeStock(int id, int newStock) {
        Product product=products.get(id);
        product.setStock(newStock);
        notifyObservers(product);
    }

    public void list(){
        for (int i=0; i<products.size(); i++) {
            System.out.println((i + 1) + ") " + products.get(i));
         }
    }
    public Product get(int id) {
        return products.get(id);
    
      }
}
