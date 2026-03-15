package bt2;

public class Main {

    public static void main(String[] args) {

        TicketPool roomA = new TicketPool("A", 10);
        TicketPool roomB = new TicketPool("B", 10);

        BookingCounter counter1 =
                new BookingCounter("Quay 1", roomA, roomB);

        BookingCounter counter2 =
                new BookingCounter("Quay 2", roomA, roomB);

        Thread t1 = new Thread(counter1);
        Thread t2 = new Thread(counter2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ket thuc chuong trinh");

        System.out.println("Quay 1 ban duoc: " +
                counter1.getSoldCount() + " ve");

        System.out.println("Quay 2 ban duoc: " +
                counter2.getSoldCount() + " ve");

        System.out.println("Ve con lai phong A: " +
                roomA.getRemainingTickets());

        System.out.println("Ve con lai phong B: " +
                roomB.getRemainingTickets());
    }
}