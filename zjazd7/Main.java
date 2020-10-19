// Marta Rosińska

package Zad1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TicketsFinder tf = new TicketsFinder();

        Ticket[] results = tf.findTickets("GDN", "WAR", new Date(2019, 6, 1), new Date(2019, 9,1));
        for(Ticket ticket: results) {
            System.out.println(ticket);
        }
    }
}
