package bt3;

public class CreditCardPayment implements CardPayable {

    @Override
    public void processCreditCard(double amount) {
        System.out.println("Xu ly thanh toan the tin dung: " + amount + " - Thanh cong");
    }
}
