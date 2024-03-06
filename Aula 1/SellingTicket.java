import java.util.ArrayList;
import java.util.List;

class Ticket4 {
    private String eventName;
    private String customerName;
    private double price;

    public Ticket4(String eventName, String customerName, double price) {
        this.eventName = eventName;
        this.customerName = customerName;
        this.price = price;
    }

    public String getEventName() {
        return eventName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getPrice() {
        return price;
    }
}

class ResellTicket2 extends Ticket4 {
    private double resalePrice;

    public ResellTicket2(Ticket4 ticket, String costumerName, double resalePrice) {
        super(ticket.getEventName(), costumerName, ticket.getPrice());
        if (ticket instanceof ResellTicket2) {
            throw new IllegalArgumentException("Cannot resell a resold ticket");
        }
        this.resalePrice = resalePrice;
    }

    public double getResalePrice() {
        return resalePrice;
    }
}

class Event {
    private int ticketLimit;
    private String eventName;
    private List<Ticket4> tickets;

    public Event(String eventName, int ticketLimit) {
        this.eventName = eventName;
        this.tickets = new ArrayList<>();
        this.ticketLimit = ticketLimit;
    }

    public void sellTicket(String customerName, double price) {
        if (tickets.size() >= ticketLimit) {
            throw new IllegalArgumentException("Ticket limit reached for event: " + eventName);
        }
        Ticket4 ticket = new Ticket4(eventName, customerName, price);
        tickets.add(ticket);
    }

    public void resellTicket(String originalCustomerName, String newCustomerName, double resalePrice) {
        Ticket4 originalTicket = findTicketByCustomerName(originalCustomerName);
        if (originalTicket == null) {
            throw new IllegalArgumentException("Ticket not found for customer: " + originalCustomerName);
        }
        if (originalTicket instanceof ResellTicket2) {
            throw new IllegalArgumentException("Cannot resell a resold ticket");
        }
        ResellTicket2 resellTicket = new ResellTicket2(originalTicket, newCustomerName, resalePrice);
        tickets.remove(originalTicket);
        tickets.add(resellTicket);
    }

    private Ticket4 findTicketByCustomerName(String customerName) {
        for (Ticket4 ticket : tickets) {
            if (ticket.getCustomerName().equals(customerName)) {
                return ticket;
            }
        }
        return null;
    }

    public List<Ticket4> getTickets() {
        return tickets;
    }
}

public class SellingTicket {
    public static void main(String[] args) {
        Event event = new Event("Concert", 2);

        event.sellTicket("John Doe", 100);
        event.sellTicket("Jane Smith", 120);

        event.resellTicket("John Doe", "João Dói", 150);

        for (Ticket4 ticket : event.getTickets()) {
            System.out.println("Event name: " + ticket.getEventName());
            System.out.println("Customer name: " + ticket.getCustomerName());
            System.out.println("Ticket price: " + ticket.getPrice());
            if (ticket instanceof ResellTicket2) {
                ResellTicket2 resellTicket = (ResellTicket2) ticket;
                System.out.println("Resale price: " + resellTicket.getResalePrice());
            }
        }

        event.sellTicket("Joana Doia", 100);
    }
}