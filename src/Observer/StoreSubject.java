package Observer;

import Classes.Product;

import java.util.ArrayList;
import java.util.List;

public class StoreSubject {
    private final List<StoreObserver> observers = new ArrayList<>();

    public void addObserver(StoreObserver observer){
        observers.add(observer);
    }
    public void notifyObservers(Product product){
        for(StoreObserver observer : observers){
            observer.update(product);
        }
    }
}
