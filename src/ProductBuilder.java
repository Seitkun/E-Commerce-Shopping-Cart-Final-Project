public class ProductBuilder implements Builder {

    Product product = new Product();

    @Override
    public Builder setName(String name) {
        product.name = name;
        return this;
    }

    @Override
    public Builder setPrice(double price) {
        product.price = price;
        return this;
    }

    @Override
    public Builder setStock(int stock) {
        product.stock = stock;
        return this;
    }

    @Override
    public Product build() {
        return product;
    }
}
