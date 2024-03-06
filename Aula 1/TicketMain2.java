public class TicketMain2 {
    public static void main(String[] args) {
        Ticket2 ticket = new Ticket2("Concert", "John Doe", 100);
        System.out.println("Event name: " + ticket.getEventName());
        System.out.println("Customer name: " + ticket.getCustomerName());
        System.out.println("Ticket price: " + ticket.getPrice());
    }
}

class Ticket2 {
    private String eventName;
    private String customerName;
    private double price;

    public Ticket2(String eventName, String customerName, double price) {
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