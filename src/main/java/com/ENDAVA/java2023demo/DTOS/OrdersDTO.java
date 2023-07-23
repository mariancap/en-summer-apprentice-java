package com.ENDAVA.java2023demo.DTOS;

import java.util.Date;

public record OrdersDTO (
        Integer eventId,
        Date timestamp,
        int ticketCategoryId,
        Integer numberofTickets,
        Integer totalPrice

    )
{

}