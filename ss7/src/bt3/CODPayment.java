package bt3;

public class CODPayment implements CODPayable {

    @Override
    public void processCOD(double amount) {
        System.out.println("Xu ly thanh toan COD: " + amount + " - Thanh cong");
    }
}