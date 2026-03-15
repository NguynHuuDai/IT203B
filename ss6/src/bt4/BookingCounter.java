package bt4;

public class BookingCounter implements Runnable {

    private TicketPool pool;
    private String counterName;
    private int soldCount = 0;

    public BookingCounter(String counterName, TicketPool pool) {
        this.counterName = counterName;
        this.pool = pool;
    }

    public int getSoldCount() {
        return soldCount;
    }

    @Override
    public void run() {

        Thread.currentThread().setName(counterName);

        while (true) {

            Ticket ticket = pool.sellTicket();

            if (ticket != null) {

                soldCount++;

                System.out.println(
                        counterName
                                + " ban ve "
                                + ticket.getTicketId());
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}