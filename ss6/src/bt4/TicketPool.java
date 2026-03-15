package bt4;

import java.util.ArrayList;
import java.util.List;

public class TicketPool {

    private String roomName;
    private List<Ticket> tickets = new ArrayList<>();
    private int nextNumber = 1;

    public TicketPool(String roomName, int initialTickets) {

        this.roomName = roomName;

        addTickets(initialTickets);
    }

    public synchronized Ticket sellTicket() {

        while (tickets.isEmpty()) {

            try {

                System.out.println(
                        Thread.currentThread().getName()
                                + ": Het ve phong "
                                + roomName
                                + ", dang cho...");

                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Ticket ticket = tickets.remove(0);

        ticket.setSold(true);

        return ticket;
    }

    public synchronized void addTickets(int count) {

        for (int i = 0; i < count; i++) {

            String id = roomName + "-"
                    + String.format("%03d", nextNumber++);

            tickets.add(new Ticket(id, roomName));
        }

        System.out.println(
                "Nha cung cap: Da them "
                        + count
                        + " ve vao phong "
                        + roomName);

        notifyAll();
    }

    public synchronized int getRemaining() {
        return tickets.size();
    }

    public String getRoomName() {
        return roomName;
    }
}