package org.eternity.theater.advance;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.hasValidTicket()) {
            return;
        }
        ticketSeller.sellTo(audience);
    }
}
