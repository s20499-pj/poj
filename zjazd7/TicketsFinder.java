// Marta Rosińska

package

import java.util.ArrayList;
import java.util.Date;

public class TicketsFinder {

    private ArrayList<AbstractTicketsService> services = new ArrayList<>();

    public TicketsFinder() {
        this.services.add(new BritishAirwaysTicketsService());
        this.services.add(new UnitedAirlinesTicketsService());
    }

    private Date[] getDaysBetween(Date d1, Date d2) {
        long oneDay = 86400 * 1000;

        ArrayList<Date> results = new ArrayList<>();
        Date nextDate = d1;
        while(nextDate.before(d2)) {
            results.add(nextDate);
            nextDate.setTime(nextDate.getTime() + oneDay);
        }

        return results.toArray(new Date[results.size()]);
    }

    public Ticket[] findTickets(String from, String to, Date startDate, Date endDate) {
        ArrayList<Ticket> results = new ArrayList<>();

        Date[] dates = getDaysBetween(startDate, endDate);
        for(AbstractTicketsService service: services) {
            for(Date date: dates) {
                results.addAll(service.getTickets(from, to, date));
            }
        }

        return results.toArray(new Ticket[results.size()]);
    }
}
