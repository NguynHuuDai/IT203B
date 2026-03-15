package bt3;

public class BookingCounter implements Runnable {

    private String counterName;
    private TicketPool first;
    private TicketPool second;

    public BookingCounter(String name, TicketPool first, TicketPool second) {

        this.counterName = name;
        this.first = first;
        this.second = second;
    }

    public void sellCombo() {

        synchronized (first) {

            Ticket t1 = first.getAvailableTicket();

            if (t1 == null) {
                System.out.println(counterName + ": Het ve phong " + first.getRoomName());
                return;
            }

            t1.setSold(true);

            System.out.println(counterName + " da lay ve " + t1.getTicketId());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}

            synchronized (second) {

                Ticket t2 = second.getAvailableTicket();

                if (t2 == null) {

                    t1.setSold(false);

                    System.out.println(counterName + ": Combo that bai");
                    return;
                }

                t2.setSold(true);

                System.out.println(counterName +
                        " ban combo thanh cong: "
                        + t1.getTicketId() + " & "
                        + t2.getTicketId());
            }
        }
    }

    @Override
    public void run() {

        while (true) {

            sellCombo();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {}
        }
    }
}
