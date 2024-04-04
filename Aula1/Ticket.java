package Aula1;

/**
 * The Ticket class represents a ticket for an event.
 * It contains information about the event name, customer name, and price of the ticket.
 */
class Ticket {
    private String eventName;
    private String customerName;
    private double price;

    static int soldTickets = 0;

    /**
     * Constructs a Ticket object with the specified event name, customer name, and price.
     * 
     * @param eventName the name of the event
     * @param customerName the name of the customer
     * @param price the price of the ticket
     */
    public Ticket(String eventName, String customerName, double price) {
        this.eventName = eventName;
        this.customerName = customerName;
        this.price = price;
        this.soldTickets++;
    }

    public static int getSoldTickets() {
        return soldTickets;
    }

    /**
     * Returns the name of the event.
     * 
     * @return the event name
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Returns the name of the customer.
     * 
     * @return the customer name
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Returns the price of the ticket.
     * 
     * @return the ticket price
     */
    public double getPrice() {
        return price;
    }

    public boolean isResold() {
        return false;
    }
}