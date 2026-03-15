package bt4;

public class TicketSupplier implements Runnable {

    private TicketPool pool;
    private int supplyCount;
    private int interval;

    public TicketSupplier(TicketPool pool,
                          int supplyCount,
                          int interval) {

        this.pool = pool;
        this.supplyCount = supplyCount;
        this.interval = interval;
    }

    @Override
    public void run() {

        while (true) {

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            pool.addTickets(supplyCount);
        }
    }
}