package Aula1Main;
import Aula1.*;

public class MainAula1 {
    public static void main(String[] args) {
        Event event = new Event("Concert", 3);
        event.sellTicket("Alice", 50);
        event.sellTicket("Bob", 50);
        event.sellTicket("Charlie", 50);
        event.resellTicket("Alice", "David", 60);
        event.resellTicket("Bob", "Eve", 60);
        event.resellTicket("Charlie", "Frank", 60);
        for (Ticket ticket : event.getTickets()) {
            System.out.println(ticket.getCustomerName() + " bought a ticket for " + ticket.getEventName() + " for " + ticket.getPrice());
        }
        System.out.println("Total revenue: " + event.calculateRevenue());
    }
}