package org.eternity.theater.advance;

public class Bag {
    private Long amount;
    private Ticket ticket;
    private Invitation invitation;

    public void hold(Ticket ticket) {
        if (hasInvitation()) {
            throw new IllegalStateException("Invitation이 있어서 티켓을 구매할 수 없습니다.");
        }
        if (ticket != null)
            throw new IllegalStateException("티켓이 이미 보유중입니다.");

        setTicket(ticket);
    }

    public void takeMoney(Long amount) {
        if (this.amount < amount) {
            throw new IllegalStateException("잔액이 부족합니다.");
        }
        this.amount -= amount;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public boolean hasValidTicket() {
        return hasInvitation() || ticket != null;
    }
}
