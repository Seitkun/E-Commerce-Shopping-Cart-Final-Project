package Strategy;

public class FirstBuyDiscount implements DiscountStrategy {

    @Override
    public double setDiscount(double price) {
        return price * 0.9;
    }
}
