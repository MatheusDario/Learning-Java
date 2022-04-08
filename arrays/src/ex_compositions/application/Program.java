/*
Ler os dados de um pedido com N itens (N fornecido pelo usuario).
Depois mostrar um sumario do pedido conforme o exemplo.
 */
package ex_compositions.application;

import ex_compositions.entities.Client;
import ex_compositions.entities.Order;
import ex_compositions.entities.OrderItem;
import ex_compositions.entities.Product;
import ex_compositions.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cliente data:");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);


        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client); //associando a ordem de pedido com a data atual, status e cliente

        System.out.print("How many items to this order? ");
        int numItens = sc.nextInt();

        for(int i=1; i<=numItens; i++) {
            System.out.println("Enter # " + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String nameProduct = sc.nextLine();
            System.out.print("Product price: ");
            double priceProduct = sc.nextDouble();

            Product product = new Product(nameProduct, priceProduct);

            System.out.print("Quantity: ");
            int qntProducts = sc.nextInt();

            OrderItem orderItem = new OrderItem(qntProducts, priceProduct, product);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}
