// Marta Rosińska

package zjazd7;

import java.util.Date;

public class Ticket {
    private double price;
    private String origin;
    private String destination;
    private Date time;

    Ticket(double price, String from, String to, Date time)
    {
        this.price = price;
        this.origin = from;
        this.destination = to;
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public String departureAirport() {
        return origin;
    }

    public String targetAirport() {
        return destination;
    }

    public Date getFlightTime() {
        return time;
    }

    public String toString() {
        return origin + " -> " + destination + " " + time + " : " + price;
    }
}
