package com.ticket;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    // TicketSeller 클래스의 sellTo 메소드 선언을 통한 캡슐화 -> Theater-TicketSeller 간의 결합도 감소
    public void enter(Audience audience) {  
        ticketSeller.sellTo(audience);
    }
}
