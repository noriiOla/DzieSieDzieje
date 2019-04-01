package com.dziesiedzieje.dziesiedzieje.controller;

import com.dziesiedzieje.dziesiedzieje.entity.Event;
import com.dziesiedzieje.dziesiedzieje.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewUser(@RequestParam String name,
                      @RequestParam String longitude,
                      @RequestParam String latitude) {

        Event event = new Event();
        event.setName(name);
        event.setLatitude(latitude);
        event.setLongitude(longitude);
        eventRepository.save(event);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Event> getAllUsers() {
        return eventRepository.findAll();
    }
}
