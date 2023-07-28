package com.ENDAVA.java2023demo.Servicies;

import com.ENDAVA.java2023demo.DTOS.EventDTO;
import com.ENDAVA.java2023demo.DTOS.EventDTOMapper;
import com.ENDAVA.java2023demo.Interfaces.IEventService;
import com.ENDAVA.java2023demo.Repositories.EventRepository;
import com.ENDAVA.java2023demo.TableEntities.EVENT;
import com.ENDAVA.java2023demo.TableEntities.VENUE;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class EventService implements IEventService {

    private final EventRepository eventRepository;
    private final EventDTOMapper eventDTOMapper;



    public EventService(EventRepository eventRepository, EventDTOMapper eventDTOMapper) {
        this.eventRepository = eventRepository;
        this.eventDTOMapper = eventDTOMapper;
    }



    @Override
    public List<EventDTO> getEvents() {
        return eventRepository.findAll()
                .stream().map(eventDTOMapper).collect(Collectors.toList());
    }

    @Override
    public EventDTO getEvent(Integer id) {
        return eventRepository.findById(id)
                .map(eventDTOMapper)
                .orElseThrow(()->new IllegalStateException(String.format("Customer with ID %s doesn't exist",id)));
    }

    @Override
    public List<EventDTO> getEventByVenueIdAndEventType(int VenueId,String eventType) {
        List<EVENT> events=eventRepository.searchByVenueAndType(VenueId,eventType);
        if(!events.isEmpty())
        {
            return events.stream().map(eventDTOMapper).collect(Collectors.toList());
        }

        return Collections.EMPTY_LIST;

    }





}
