package Aula1;

/**
 * Represents a resold ticket.
 * 
 * This class extends the Ticket class and represents a ticket that has been resold to a new customer.
 * It stores information about the original ticket being resold, the name of the new customer, and the resale price of the ticket.
 */
public class ResellTicket extends Ticket {
    private double resalePrice;

    /**
     * Constructs a ResellTicket object.
     * 
     * @param ticket        the original ticket being resold
     * @param costumerName  the name of the new customer
     * @param resalePrice   the resale price of the ticket
     * @throws IllegalArgumentException if the original ticket is already resold
     */
    public ResellTicket(Ticket ticket, String costumerName, double resalePrice) {
        super(ticket.getEventName(), costumerName, ticket.getPrice());
        if (ticket.isResold()) {
            throw new IllegalArgumentException("Cannot resell a resold ticket");
        }
        this.resalePrice = resalePrice;
    }

    /**
     * Returns the resale price of the ticket.
     * 
     * @return the resale price of the ticket
     */
    public double getResalePrice() {
        return resalePrice;
    }

    /**
     * Checks if the ticket has been resold.
     * 
     * @return true if the ticket has been resold, false otherwise
     */
    public boolean isResold() {
        return true;
    }
}