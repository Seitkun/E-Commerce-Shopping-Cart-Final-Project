package Strategy;

public class Discounter {
    private DiscountStrategy strategy;
    public Discounter(DiscountStrategy strategy) {
        this.strategy = strategy;
    }
    public DiscountStrategy getStrategy() {
        return strategy;
    }
    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }
    public double discount(double price) {
        return strategy.setDiscount(price);
    }
}
