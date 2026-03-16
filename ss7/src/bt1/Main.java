package bt1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Tao san pham
        Product p1 = new Product("SP01", "Laptop", 15000000);
        Product p2 = new Product("SP02", "Chuot", 300000);

        System.out.println("Da them san pham SP01, SP02");

        // Tao khach hang
        Customer customer = new Customer("Nguyen Van A", "a@example.com", "Ha Noi");

        System.out.println("Da them khach hang");

        // Tao don hang
        Map<Product, Integer> products = new HashMap<>();
        products.put(p1, 1);
        products.put(p2, 2);

        Order order = new Order("ORD001", customer, products);

        System.out.println("Don hang ORD001 duoc tao");

        // Tinh tong tien
        OrderCalculator calculator = new OrderCalculator();
        double total = calculator.calculateTotal(order);

        order.setTotal(total);

        System.out.println("Tong tien: " + total);

        // Luu don hang
        OrderRepository repository = new OrderRepository();
        repository.save(order);

        // Gui email
        EmailService emailService = new EmailService();
        emailService.sendEmail(customer, "Don hang ORD001 da duoc tao");
    }
}
