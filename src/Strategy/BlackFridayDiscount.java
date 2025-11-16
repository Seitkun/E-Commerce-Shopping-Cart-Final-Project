package Strategy;

public class BlackFridayDiscount implements DiscountStrategy {

    @Override
    public double setDiscount(double price) {
        return price * 0.75;
    }
}
