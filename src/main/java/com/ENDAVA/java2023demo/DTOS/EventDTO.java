package com.ENDAVA.java2023demo.DTOS;

import com.ENDAVA.java2023demo.TableEntities.EVENT_TYPE;
import com.ENDAVA.java2023demo.TableEntities.TICKET_CATEGORY;
import com.ENDAVA.java2023demo.TableEntities.VENUE;
import jakarta.persistence.Id;

import java.util.Date;

public record EventDTO(
        Integer id,
        VENUE venue,
        EVENT_TYPE type,
        String description,
        String name,
        Date startDate,
        Date endDate

) {
}
