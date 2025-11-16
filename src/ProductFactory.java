public class ProductFactory {
    public static Product create(String t){
        String producType=t.trim().toUpperCase();
                switch (producType){
                    case "LAPTOP":
                        return new Laptop.LaptopBuilder()
                                .setRam(16)
                                .setssd(512)
                                .setcolor("white")
                                .build();
                    case "PHONE":
                        return new SmartPhone.PhoneBuilder()
                                .setModel("iphone 17")
                                .setStorage(256)
                                .setColor("white")
                                .build();
                        default:
                            throw new IllegalArgumentException("Wrong product  type");
                }
    }
}
