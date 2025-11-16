import java.util.Scanner;
import Classes.*;
import Decorator.*;
import Facade.StoreFacade;
import Observer.*;
import Strategy.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Store store=new Store();
        Cart cart=new Cart();
        store.addObserver(cart);

        StoreFacade storeFacade=new StoreFacade(store, cart);

        while(true) {
            System.out.println("\nWelcome to E-Commerce Store!");
            System.out.println("Choose option\n 1. Manage product (Admin)\n2. Buy product (User)\n3. Exit");
            int choice=scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1-> {
                    System.out.println("Welcome to Admin menu!\n" +
                            "Choose option:\n" +
                            "1. Add product\n" +
                            "2. Change product price\n" +
                            "3. Change product stock\n" +
                            "4. List products\n" +
                            "5. Clone product\n" +
                            "6. Exit\n");
                    int option=scanner.nextInt();
                    switch (option) {
                        case 1 -> {
                            System.out.println("Enter product name: ");
                            scanner.nextLine();
                            String productName= scanner.nextLine();
                            System.out.println("Enter product price: ");
                            double productPrice=  scanner.nextDouble();
                            System.out.println("Enter product stock: ");
                            int productStock=scanner.nextInt();
                            storeFacade.adminAddProduct(productName, productPrice, productStock);
                            System.out.println("Product added successfully!");
                            System.out.println("================================");
                        }
                        case 2->{
                            store.list();
                            System.out.println("Enter product ID to change price: ");
                            int id = scanner.nextInt() - 1;
                            System.out.println("Enter new price: ");
                            double newPrice=scanner.nextDouble();
                            store.changePrice(id, newPrice);
                            System.out.println("Price updated successfully!");
                            System.out.println("================================");
                        }
                        case 3-> {
                            store.list();
                            System.out.println("Enter product ID to change stock: ");
                            int id=scanner.nextInt() - 1;
                            System.out.println("Enter new stock: ");
                            int stock=scanner.nextInt();
                            store.changeStock(id, stock);
                            System.out.println("Stock updated successfully!");
                            System.out.println("================================");}
                        case 4-> {
                            store.list();
                            System.out.println("================================");
                        }
                        case 5->{
                            store.list();
                            System.out.println("Enter product ID to clone: ");
                            int id=scanner.nextInt() - 1;
                            storeFacade.cloneProduct(id);
                            System.out.println("Product cloned successfully!");
                            System.out.println("================================");}
                        case 6-> {
                            System.out.println("Exiting...\n" +
                                    "================================");
                            return;
                        }
                        default->
                                System.out.println("Invalid option\n================================");
                    }
                }
                case 2-> {
                    System.out.println("Welcome to user menu:\n" +
                            "1. Add product to cart\n" +
                            "2. Remove product from cart\n" +
                            "3. List cart products\n" +
                            "4. Use discount\n" +
                            "5. Decorate product in cart\n" +
                            "6. Buy\n" +
                            "7. Exit");

                    int option2 = scanner.nextInt();
                    switch (option2) {
                        case 1-> {
                            store.list();
                            System.out.println("Enter product ID to add to cart: ");
                            int id=scanner.nextInt() - 1;
                            storeFacade.userAddToCart(id);
                            System.out.println("Product added to cart!");
                            System.out.println("================================");
                        }
                        case 2->{
                            cart.show();
                            System.out.println("Enter product ID to remove from cart: ");
                            int id=scanner.nextInt() - 1;
                            cart.remove(id);
                            System.out.println("Product removed from cart!");
                            System.out.println("================================");
                        }
                        case 3-> {
                            cart.show();
                            System.out.println("================================");
                        }
                        case 4-> {
                            System.out.println("Choose discount: 1. BlackFridayDiscount  2. FirstBuyDiscount ");
                            int discount = scanner.nextInt();
                            Discounter discounter = discount == 1
                                    ? new Discounter(new BlackFridayDiscount())
                                    : new Discounter(new FirstBuyDiscount());
                            cart.applyDiscount(discounter.getStrategy());
                            System.out.println("Discount applied successfully!");
                            System.out.println("================================");
                        }
                        case 5-> {
                            cart.show();
                            System.out.println("Enter product ID to decorate: ");
                            int id=scanner.nextInt() - 1;
                            System.out.println("Choose decorator: 1. GiftDecorator");
                            int decor=scanner.nextInt();
                            if (decor == 1) {
                                cart.decorateProduct(id, GiftDecorator.class);
                                System.out.println("Product decorated successfully!");
                            }
                            System.out.println("================================");
                        }
                        case 6-> {
                            System.out.println("Purchase completed successfully!");
                            System.out.println("================================");
                        }
                        case 7-> {
                            System.out.println("Exiting...\n" +
                                    "================================");
                            return;
                        }
                        default->
                                System.out.println("Invalid option!\n================================");
                    }
                }
                case 3-> {
                    System.out.println("Exiting...\n================================");
                    return;
                }
                default-> System.out.println("Invalid option!\n================================");

     }
      
    }
    
    }
}

