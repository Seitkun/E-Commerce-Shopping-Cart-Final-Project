public class Laptop implements Product {
private final double ram;
private final double ssd;
private final String color;
private Laptop(LaptopBuilder b){
    this.ram=b.ram;
    this.ssd=b.ssd;
    this.color=b.color;
}
@Override
public String getname(){
    return "laptop";

}
@Override
public void show(){
    System.out.println("laptop \n storage \n RAM "+  ram+"gb"+"\n ssd "+ssd+"gb"+"\n color "+color);
}

public static class LaptopBuilder {
        private double ram=8;
        private double ssd=8;
        private String color="black";
        public LaptopBuilder setRam(double r) {
            this.ram=r;
            return this;
        }
        public LaptopBuilder setssd(double s) {
            this.ssd=s;
            return this;
        }
        public LaptopBuilder
        setcolor(String c) {
            this.color=c;
            return this;
        }
        public Product build() {
            return new Laptop(this);
        }
    }}
