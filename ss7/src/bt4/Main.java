package bt4;

public class Main {

    public static void main(String[] args) {

        OrderRepository fileRepo = new FileOrderRepository();
        NotificationService email = new EmailService();

        OrderService service1 = new OrderService(fileRepo, email);

        Order order1 = new Order("ORD001");

        System.out.println("Tao don hang ORD001");

        service1.createOrder(order1, "user@email.com");


        System.out.println();


        OrderRepository dbRepo = new DatabaseOrderRepository();
        NotificationService sms = new SMSNotification();

        OrderService service2 = new OrderService(dbRepo, sms);

        Order order2 = new Order("ORD002");

        System.out.println("Tao don hang ORD002");

        service2.createOrder(order2, "0123456789");
    }
}