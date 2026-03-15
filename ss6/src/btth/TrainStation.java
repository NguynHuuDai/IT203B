package btth;
public class TrainStation {

    private Integer quantity;

    public TrainStation(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void sellTicket(String boxOffice) {
        if (quantity > 0) {
            System.out.println("Số lượng vé trong kho = " + quantity);

            // Mô phỏng nhân viên thao tác trên máy tính mất 500 milis
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }

            quantity--;

            System.out.println("✅ " + boxOffice + " đã bán được 1 vé, số lượng còn lại = " + quantity);
        } else {
            System.out.println("❌ Đã bán hết vé rồi!!!");
        }
    }
}