package bt1;

public class TicketCounter implements Runnable {

    private TicketPool pool;
    private String counterName;
    private int sold = 0;

    public TicketCounter(String counterName, TicketPool pool) {
        this.counterName = counterName;
        this.pool = pool;
    }

    public int getSold() {
        return sold;
    }

    @Override
    public void run() {
        while (true) {

            Ticket ticket = pool.sellTicket();

            if (ticket == null) {
                break;
            }

            sold++;

            System.out.println(counterName + " da ban ve " + ticket.getId());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(counterName + " ban duoc: " + sold + " ve");
    }
}