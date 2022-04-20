package about_enum.application;

import about_enum.entities.Order;
import about_enum.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PADING_PAYMEN);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(order);
        System.out.println(os1);
        System.out.println(os2);

    }
}
