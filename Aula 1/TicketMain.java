public class TicketMain {
    public static void main(String[] args) {
        Ticket ticket = createTicket("Concert", "John Doe", 50.0);
        displayTicket(ticket);
    }

    private static Ticket createTicket(String eventName, String customerName, double price) {
        Ticket ticket = new Ticket();
        ticket.setEventName(eventName);
        ticket.setCustomerName(customerName);
        ticket.setPrice(price);
        return ticket;
    }

    private static void displayTicket(Ticket ticket) {
        System.out.println("Event: " + ticket.getEventName());
        System.out.println("Customer: " + ticket.getCustomerName());
        System.out.println("Price: $" + ticket.getPrice());
    }
}

class Ticket {
    private String eventName;
    private String customerName;
    private double price;

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}