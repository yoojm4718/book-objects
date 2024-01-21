package com.ticket;

public class App {
    public static void main(String[] args) {
        Audience audience1 = new Audience(new Bag(10000L));
        Audience audience2 = new Audience(new Bag(new Invitation(), 50000L));

        Theater theater = new Theater(new TicketSeller(new TicketOffice(5000L, new Ticket(5000L), new Ticket(5000L), new Ticket(5000L), new Ticket(5000L))));

        theater.enter(audience1);
        theater.enter(audience2);
    }
}
