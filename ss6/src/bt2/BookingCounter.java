package bt2;

import java.util.Random;

public class BookingCounter implements Runnable {

    private String counterName;
    private TicketPool roomA;
    private TicketPool roomB;
    private int soldCount;

    public BookingCounter(String counterName, TicketPool roomA, TicketPool roomB) {
        this.counterName = counterName;
        this.roomA = roomA;
        this.roomB = roomB;
        this.soldCount = 0;
    }

    public int getSoldCount() {
        return soldCount;
    }

    @Override
    public void run() {

        Random random = new Random();

        while (true) {

            if (roomA.getRemainingTickets() == 0 &&
                    roomB.getRemainingTickets() == 0) {
                break;
            }

            Ticket ticket = null;

            int choice = random.nextInt(2);

            if (choice == 0) {

                ticket = roomA.sellTicket();

                if (ticket == null) {
                    ticket = roomB.sellTicket();
                }

            } else {

                ticket = roomB.sellTicket();

                if (ticket == null) {
                    ticket = roomA.sellTicket();
                }
            }

            if (ticket != null) {

                soldCount++;

                System.out.println(counterName +
                        " da ban ve " +
                        ticket.getTicketId());
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(counterName +
                " ban duoc: " + soldCount + " ve");
    }
}