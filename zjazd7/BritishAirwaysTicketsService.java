// Marta Rosińska

package Zad1;

import Zad1.britishairways.*;

import java.util.ArrayList;
import java.util.Date;

public class BritishAirwaysTicketsService extends AbstractTicketsService
{
    private BATicketService ticketsService = new BATicketService();

    public ArrayList<Ticket> getTickets(String from, String to, Date date) {
        Airport originAirport = new Airport(from);
        Airport destinationAirport = new Airport(to);
        ArrayList<BATicket> baTickets = ticketsService.getTicketInfo(originAirport, destinationAirport, date);

        ArrayList<Ticket> tickets = new ArrayList<>();
        for (BATicket baTicket : baTickets) {
            Ticket ourTicket = new Ticket(baTicket.ticketPrice, from, to, baTicket.departureTime);
            tickets.add(ourTicket);
        }
        return tickets;
    }
}

