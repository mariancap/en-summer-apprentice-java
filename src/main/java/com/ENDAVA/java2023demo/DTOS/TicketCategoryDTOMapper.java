package com.ENDAVA.java2023demo.DTOS;

import com.ENDAVA.java2023demo.TableEntities.TICKET_CATEGORY;
import com.ENDAVA.java2023demo.TableEntities.VENUE;

import java.util.function.Function;

public class TicketCategoryDTOMapper implements Function<TICKET_CATEGORY,TicketCategoryDTO> {
    @Override
    public TicketCategoryDTO apply(TICKET_CATEGORY ticket_category) {
        return new TicketCategoryDTO(
                ticket_category.getPrice(),
                ticket_category.getTicket_description(),
                ticket_category.getTicketCategoryID(),
                ticket_category.getEvent().getEventID());
    }
}
