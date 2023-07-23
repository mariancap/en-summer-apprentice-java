package com.ENDAVA.java2023demo.Controllers;


import com.ENDAVA.java2023demo.DTOS.EventDTO;
import com.ENDAVA.java2023demo.DTOS.EventDTOMapper;
import com.ENDAVA.java2023demo.Servicies.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path="/events")
public class EventController {

    private final EventService eventService;
    private final EventDTOMapper eventDTOMapper;



    public EventController(EventService eventService, EventDTOMapper eventDTOMapper) {
        this.eventService = eventService;
        this.eventDTOMapper = eventDTOMapper;
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


//    @GetMapping
//    public List<EventDTO> getEventbySearch(@RequestParam(name = "venue_id") Integer venueId,
//                                           @RequestParam(name = "event_type_name") String eventType){
//        return  eventService.getEventsByVenueIdAndEventType(venueId,eventType);
//    }

    



}
