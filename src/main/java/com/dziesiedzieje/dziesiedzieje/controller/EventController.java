package com.dziesiedzieje.dziesiedzieje.controller;

import com.dziesiedzieje.dziesiedzieje.mapper.dts.EventDts;
import com.dziesiedzieje.dziesiedzieje.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/events")
public class EventController {

    @Autowired
    EventService eventService;


    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<EventDts> getAllUsers() {

        eventService.addDummyEvent();

        return eventService.findAllEvents();
    }
}
