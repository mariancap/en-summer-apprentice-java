package com.ENDAVA.java2023demo.DTOS;

import com.ENDAVA.java2023demo.TableEntities.TICKET_CATEGORY;
import com.ENDAVA.java2023demo.TableEntities.VENUE;

import java.util.Date;
import java.util.List;

public record EventDTO(
        Integer id,
        VENUE venue,
        String type,
        String description,
        String name,
        Date startDate,
        Date endDate,
        List<TICKET_CATEGORY> ticket_categoryList) {
}
