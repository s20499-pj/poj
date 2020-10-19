// Marta Rosińska

package zjazd7;

import java.util.ArrayList;
import java.util.Date;

public abstract class AbstractTicketsService {
    public abstract ArrayList<Ticket> getTickets(String from, String to, Date date);
}
