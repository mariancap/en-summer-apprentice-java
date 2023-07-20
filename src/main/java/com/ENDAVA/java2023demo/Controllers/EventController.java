package com.ENDAVA.java2023demo.Controllers;


import com.ENDAVA.java2023demo.Servicies.EventService;
import com.ENDAVA.java2023demo.TableEntities.EVENT;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/events")
public class EventController {

    private final EventService eventService;


    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<EVENT>getEvents()
    {
        return eventService.getEvents();
    }
}
