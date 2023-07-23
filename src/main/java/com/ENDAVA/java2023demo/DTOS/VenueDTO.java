package com.ENDAVA.java2023demo.DTOS;

import com.ENDAVA.java2023demo.TableEntities.TICKET_CATEGORY;

import java.util.Date;
import java.util.List;

public record VenueDTO(
        Integer id,
        String location,
        String name,
        Integer capacity)

        {
}
