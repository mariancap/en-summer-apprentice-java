package com.ENDAVA.java2023demo.Controllers;


import com.ENDAVA.java2023demo.DTOS.EventDTO;
import com.ENDAVA.java2023demo.DTOS.EventDTOMapper;
import com.ENDAVA.java2023demo.Repositories.EventRepository;
import com.ENDAVA.java2023demo.Servicies.EventService;
import com.ENDAVA.java2023demo.TableEntities.EVENT;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EventController {

    private final EventService eventService;




    public EventController(EventService eventService) {
        this.eventService = eventService;

    }

    @GetMapping
    public List<EventDTO>getEvents()
    {
        return eventService.getEvents();
    }

    @GetMapping("{id}")
    public EventDTO geteventbyID(@PathVariable("id") Integer id)
    {
       return eventService.getEvent(id);
    }


    @GetMapping("/events")
    public List<EventDTO> getEventsByVenueIdAndEventType(@RequestParam int venueID, @RequestParam String eventType) {
        return eventService.getEventByVenueIdAndEventType(venueID,eventType);
    }
    



}
