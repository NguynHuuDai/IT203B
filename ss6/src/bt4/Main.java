package bt4;

public class Main {

    public static void main(String[] args) {

        TicketPool roomA = new TicketPool("A", 5);
        TicketPool roomB = new TicketPool("B", 5);

        BookingCounter counter1 =
                new BookingCounter("Quay 1", roomA);

        BookingCounter counter2 =
                new BookingCounter("Quay 2", roomB);

        TicketSupplier supplierA =
                new TicketSupplier(roomA, 3, 5000);

        TicketSupplier supplierB =
                new TicketSupplier(roomB, 3, 5000);

        Thread t1 = new Thread(counter1);
        Thread t2 = new Thread(counter2);
        Thread t3 = new Thread(supplierA);
        Thread t4 = new Thread(supplierB);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
