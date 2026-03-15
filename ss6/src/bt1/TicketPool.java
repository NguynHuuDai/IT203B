package bt1;

import java.util.LinkedList;
import java.util.Queue;

public class TicketPool {

    private Queue<Ticket> tickets = new LinkedList<>();
    private String roomName;
    private int nextNumber = 1;

    public TicketPool(String roomName, int initialTickets) {
        this.roomName = roomName;

        for (int i = 0; i < initialTickets; i++) {
            addTickets(1);
        }
    }

    public synchronized Ticket sellTicket() {
        if (tickets.isEmpty()) {
            return null;
        }
        return tickets.poll();
    }

    public synchronized void addTickets(int count) {
        for (int i = 0; i < count; i++) {
            String id = roomName + "-" + String.format("%03d", nextNumber++);
            tickets.add(new Ticket(id));
        }
    }

    public synchronized int getRemaining() {
        return tickets.size();
    }

    public String getRoomName() {
        return roomName;
    }
}