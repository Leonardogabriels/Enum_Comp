package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.entitiens_enum.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat frmt = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente date: ");
        System.out.print("name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = frmt.parse(scan.next());

        Client client = new Client(name, email,birthDate);

        System.out.println();
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scan.next());

        Order order = new Order(new Date(), status, client); 
        
       
        System.out.print("How many items to this order? ");
        int ordenQuantity = scan.nextInt();
        

        for(int i=1; i <=ordenQuantity; i++){
            scan.nextLine();
            System.out.println("Enter #" +i + " item data: ");
            System.out.print("Product name: ");
            String nameProduct = scan.nextLine();
           
            System.out.print("Product price: ");
            Double priceProduct = scan.nextDouble();

            Product product = new Product(nameProduct, priceProduct);

            System.out.print("Quantity: ");
            Integer quantity = scan.nextInt();
            OrderItem orderItem = new OrderItem(quantity, priceProduct, product);

            order.addItem(orderItem);
            
            
            
        }
        scan.close();
        System.out.println();
        System.out.println("ORDER SUMMARY");
        System.out.println(order);
        
        
        

        
    }
}
