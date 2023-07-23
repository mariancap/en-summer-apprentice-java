package com.ENDAVA.java2023demo.Servicies;

import com.ENDAVA.java2023demo.DTOS.EventDTO;
import com.ENDAVA.java2023demo.DTOS.EventDTOMapper;
import com.ENDAVA.java2023demo.Interfaces.IEventService;
import com.ENDAVA.java2023demo.Repositories.EventRepository;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
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

//    public List<EventDTO> getEventsByVenueIdAndEventType(Integer venueId,String eventType)
//    {
//        return eventRepository.findEventsByVenueIdAndEventType(venueId,eventType)
//                .stream().map(eventDTOMapper).collect(Collectors.toList());
//    }


}
