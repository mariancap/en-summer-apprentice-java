package com.ENDAVA.java2023demo.DTOS;

import com.ENDAVA.java2023demo.TableEntities.ORDERS;
import com.ENDAVA.java2023demo.TableEntities.VENUE;

import java.util.function.Function;

public class OrdersDTOMapper implements Function<ORDERS,OrdersDTO> {
    @Override
    public OrdersDTO apply(ORDERS orders) {
        return new OrdersDTO(
                orders.getTicket_category().getEvent().getEventID(),
                orders.getOrdered_at(),
                orders.getTicket_category().getTicketCategoryID(),
                orders.getNumber_of_tickets(),
                orders.getTotal_price());
    }
}
