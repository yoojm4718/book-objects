package com.ticket;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    // Audience 클래스의 buy 메소드 선언을 통한 캡슙화
    //  -> TicketSeller 클래스도 Bag의 존재를 알 필요가 없음
    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
