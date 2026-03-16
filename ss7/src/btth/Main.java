package btth;

public class Main {

    public static void main(String[] args) {

        Order order = new Order("customer@gmail.com");

        OrderRepository repository = new DatabaseOrderRepository();

        PaymentStrategy payment = new CreditCardPayment();

        NotificationService notification = new EmailNotificationService();

        OrderProcessor processor =
                new OrderProcessor(repository, payment, notification);

        processor.processOrder(order);

    }

}
