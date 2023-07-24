package com.ENDAVA.java2023demo.Interfaces;

import com.ENDAVA.java2023demo.DTOS.EventDTO;
import com.ENDAVA.java2023demo.TableEntities.EVENT;
import com.ENDAVA.java2023demo.TableEntities.VENUE;

import java.util.List;

public interface IEventService {

    List<EventDTO> getEvents();

    public EventDTO getEvent(Integer id);

    public List<EventDTO> getEventByVenueIdAndEventType(int VenueId,String eventType);


}
