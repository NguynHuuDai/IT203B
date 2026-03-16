package bt1;

public class EmailService {

    public void sendEmail(Customer customer, String message) {
        System.out.println("Da gui email den " + customer.getEmail() + ": " + message);
    }
}
