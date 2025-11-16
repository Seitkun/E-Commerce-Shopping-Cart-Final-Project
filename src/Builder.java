public interface Builder {
    Builder setName(String name);
    Builder setPrice(double price);
    Builder setStock(int stock);
    Product build();
}
