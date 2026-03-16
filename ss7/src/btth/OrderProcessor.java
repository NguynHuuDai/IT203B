package btth;

public class OrderProcessor {

    private OrderRepository repository;
    private PaymentStrategy paymentStrategy;
    private NotificationService notificationService;

    public OrderProcessor(
            OrderRepository repository,
            PaymentStrategy paymentStrategy,
            NotificationService notificationService) {

        this.repository = repository;
        this.paymentStrategy = paymentStrategy;
        this.notificationService = notificationService;
    }

    public void processOrder(Order order) {

        // 1 lưu đơn hàng
        repository.save(order);

        // 2 thanh toán
        paymentStrategy.pay(order);

        // 3 gửi thông báo
        notificationService.send(
                order.getCustomerEmail(),
                "Don hang cua ban da duoc xu ly thanh cong"
        );

    }

}