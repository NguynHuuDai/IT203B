package bt1;

import java.util.Map;

public class Order {
    private String orderId;
    private Customer customer;
    private Map<Product, Integer> products;
    private double total;

    public Order(String orderId, Customer customer, Map<Product, Integer> products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
}