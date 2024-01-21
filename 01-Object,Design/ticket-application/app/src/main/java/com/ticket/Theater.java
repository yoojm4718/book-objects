package com.ticket;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    // TicketSeller 클래스의 sellTo 메소드 선언을 통한 캡슐화
    //  -> Theater는 TicketOffice, Ticket의 존재를 이제 알 필요가 없음
    public void enter(Audience audience) {  
        ticketSeller.sellTo(audience);
    }
}
