import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product asus=ProductFactory.create("laptop");
        Product apple=ProductFactory.create("phone");

        System.out.println("        Standard Products");
        asus.show();  apple.show();

        Scanner scanner=new Scanner(System.in);

        System.out.println("\n    Custom Laptop");

        try {
            double cRam=0;
            double cSsd=0;
            String cColor="";

            System.out.print("Enter RAM: ");
            cRam=scanner.nextDouble();
            if (cRam<=0){
                throw new Exception("RAM must be greater than 0");
            }

            System.out.print("Enter SSD: ");
            cSsd=scanner.nextDouble();
if(cSsd<=0){
    throw new Exception("SSD must be greater than 0");
}

            scanner.nextLine();

            System.out.print("Enter color: ");
            cColor=scanner.nextLine();
            Laptop customLaptop=(Laptop) new Laptop.LaptopBuilder()
                    .setRam(cRam)
                    .setssd(cSsd)
                    .setcolor(cColor)
                    .build();

            System.out.println("\n ");
            customLaptop.show();

        }
        catch (Exception e){
            System.out.println("\n error input ");  }
        finally {
            scanner.close();
           }
    }
}
