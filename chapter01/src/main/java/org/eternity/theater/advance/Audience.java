package org.eternity.theater.advance;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public void buy(Ticket ticket) {
        bag.hold(ticket);
        bag.takeMoney(ticket.getFee());
    }

    public boolean hasValidTicket() {
        return bag.hasValidTicket();
    }
}
