package bt3;

public class MomoPayment implements EWalletPayable {

    @Override
    public void processMomo(double amount) {
        System.out.println("Xu ly thanh toan MoMo: " + amount + " - Thanh cong");
    }
}
