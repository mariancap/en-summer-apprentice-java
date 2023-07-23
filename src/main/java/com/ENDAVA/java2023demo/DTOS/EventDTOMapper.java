package com.ENDAVA.java2023demo.DTOS;

import com.ENDAVA.java2023demo.TableEntities.EVENT;
import com.ENDAVA.java2023demo.TableEntities.TICKET_CATEGORY;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class EventDTOMapper implements Function<EVENT,EventDTO> {


    @Override
    public EventDTO apply(EVENT event) {
        return new EventDTO(event.getEventID(),
                event.getVenue().toVenueDTO(),
                event.getEventType().getEvent_Type_Name(),
                event.getEvent_description(),
                event.getEvent_name(),
                event.getData_start(),
                event.getData_end(),
                event.getTicket_categories());


    }


}
