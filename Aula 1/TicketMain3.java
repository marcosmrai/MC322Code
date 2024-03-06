public class TicketMain3 {
    public static void main(String[] args) {
        Ticket3 ticket = new Ticket3("Concert", "John Doe", 100);
        System.out.println("Event name: " + ticket.getEventName());
        System.out.println("Customer name: " + ticket.getCustomerName());
        System.out.println("Ticket price: " + ticket.getPrice());

        ResellTicket resellTicket = new ResellTicket(ticket, "João Dói", 150);
        System.out.println("Event name: " + resellTicket.getEventName());
        System.out.println("Customer name: " + resellTicket.getCustomerName());
        System.out.println("Ticket price: " + resellTicket.getPrice());

        ResellTicket reresellTicket = new ResellTicket(resellTicket, "João Terceiro", 300);
    }
}

class Ticket3 {
    private String eventName;
    private String customerName;
    private double price;

    public Ticket3(String eventName, String customerName, double price) {
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

class ResellTicket extends Ticket3 {
    private double resalePrice;

    public ResellTicket(Ticket3 ticket, String costumerName, double resalePrice) {
        super(ticket.getEventName(), costumerName, ticket.getPrice());
        if (ticket instanceof ResellTicket) {
            throw new IllegalArgumentException("Cannot resell a resold ticket");
        }
        this.resalePrice = resalePrice;
    }

    public double getResalePrice() {
        return resalePrice;
    }
}