package com.dziesiedzieje.dziesiedzieje.services;

import com.dziesiedzieje.dziesiedzieje.mapper.dts.EventDts;

import java.util.List;

public interface EventService {

    List<EventDts> findAllEvents();

    void save(EventDts eventDts);

    EventDts findOneById(String id);

    void addDummyEvent();
}
