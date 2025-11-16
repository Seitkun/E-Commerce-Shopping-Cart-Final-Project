package Decorator;

import Classes.*;

public class GiftDecorator extends ProductDecorator {
    public GiftDecorator(IProduct product) {
        super(product);
    }
    @Override
    public String makeAction() {
        return super.makeAction() + "Gift";
    }
}
