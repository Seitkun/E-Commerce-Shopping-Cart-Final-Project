import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Scanner для получения ввода пользователя
        Scanner scanner = new Scanner(System.in);
        //Переменные классов
        Store store = new Store();
        Cart cart = new Cart();

        while(true) {
            System.out.println("\nWelcome to E-Commerce Store!");
            System.out.println("Choose option\n 1. Manage product (Admin)\n2. Buy product (User)\n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Welcome to Admin menu!\n" +
                            "Choose option:\n" +
                            "1. Add product\n" +
                            "2. Change product price\n" +
                            "3. Change product stock\n" +
                            "4. List products\n" +
                            "5. Exit\n");
                    int option = scanner.nextInt();
                    scanner.nextLine();
                    switch(option) {
                        case 1:
                            //Добавляем товар через ProductBuilder
                            System.out.println("Enter product name:");
                            String name = scanner.nextLine();
                            System.out.println("Enter price:");
                            double price = scanner.nextDouble();
                            System.out.println("Enter stock:");
                            int stock = scanner.nextInt();
                            scanner.nextLine();

                            Product product = new ProductBuilder().setName(name).setPrice(price).setStock(stock).build();

                            store.addProduct(p);
                    }


                case 2:

                case 3:
                    System.out.println("Exiting...");
                    return;
                default: System.out.println("Invalid option!");
            }
        }
    }
}
