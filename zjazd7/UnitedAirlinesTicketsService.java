// Marta Rosińska

package Zad1;

import Zad1.unitedairlines.UATicketInfo;
import Zad1.unitedairlines.UATicketService;

import java.util.ArrayList;
import java.util.Date;

public class UnitedAirlinesTicketsService extends AbstractTicketsService {
    private UATicketService ticketService = new UATicketService();

    public ArrayList<Ticket> getTickets(String from, String to, Date date)
    {
        ArrayList<UATicketInfo> uaTickets = ticketService.getTicketInfo(from, to, date);

        ArrayList<Ticket> tickets = new ArrayList<>();
        for(UATicketInfo uaTicketInfo: uaTickets)
        {
            Ticket ourTicket = new Ticket(uaTicketInfo.price, uaTicketInfo.from, uaTicketInfo.to, uaTicketInfo.dateTime);
            tickets.add(ourTicket);
        }

        return tickets;
    }
}
