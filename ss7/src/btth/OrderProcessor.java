package btth;

import javax.management.Notification;

public class OrderProcessor {
    private final Database db;
    private final PaymentMethod paymentMethod;
    private final Notification notification;

    public OrderProcessor(Database db, PaymentMethod paymentMethod, Notification notification) {
        this.db = db;
        this.paymentMethod = paymentMethod;
        this.notification = notification;
    }

    public void processOrder(Order order, String paymentType) {
        // 1. Lưu vào Database
        db.save(order);

        // 2. Xử lý thanh toán
        paymentMethod.pay("Thanh toán cho đơn hàng của bạn đã được thực hiện bằng " + paymentType);

        // 3. Gửi thông báo
        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail(order.getCustomerEmail(), "Đơn hàng của bạn đã được xử lý thành công!");
    }
}

// Các class phụ trợ hiện tại
class Order {
    private String customerEmail;
    public String getCustomerEmail() { return customerEmail; }
}

class Database {
    public void save(Order order) { System.out.println("Đã lưu đơn hàng vào DB."); }

}

class EmailSender {
    public void sendEmail(String email, String message) { System.out.println("Đã gửi Email tới: " + email); }
}

