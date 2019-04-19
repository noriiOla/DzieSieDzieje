package com.dziesiedzieje.dziesiedzieje.controller;

import com.dziesiedzieje.dziesiedzieje.mapper.dts.EventDts;
import com.dziesiedzieje.dziesiedzieje.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/event")
public class EventController {

//    @Autowired
    EventService eventService;


    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<EventDts> getAllUsers() {

        eventService.addDummyEvent();

        return eventService.findAllEvents();
    }

    @PostMapping
    public ResponseEntity<EventDts> save(@RequestBody EventDts eventDts) {
        eventService.save(eventDts);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public @ResponseBody EventDts getEventById(@PathVariable(value = "id") String id) {
        return eventService.findOneById(id);
    }
}
