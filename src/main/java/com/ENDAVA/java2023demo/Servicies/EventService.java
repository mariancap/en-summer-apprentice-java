package com.ENDAVA.java2023demo.Servicies;

import com.ENDAVA.java2023demo.Interfaces.IEventService;
import com.ENDAVA.java2023demo.Repositories.EventRepository;
import com.ENDAVA.java2023demo.TableEntities.EVENT;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements IEventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }



    @Override
    public List<EVENT> getEvents() {
        return eventRepository.findAll();
    }
}
