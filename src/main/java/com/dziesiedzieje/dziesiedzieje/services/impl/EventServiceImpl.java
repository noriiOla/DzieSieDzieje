package com.dziesiedzieje.dziesiedzieje.services.impl;

import com.dziesiedzieje.dziesiedzieje.entity.EventEntity;
import com.dziesiedzieje.dziesiedzieje.entity.PlaceEntity;
import com.dziesiedzieje.dziesiedzieje.entity.PriceEntity;
import com.dziesiedzieje.dziesiedzieje.mapper.EventEntityEventDtsMapper;
import com.dziesiedzieje.dziesiedzieje.mapper.dts.EventDts;
import com.dziesiedzieje.dziesiedzieje.repository.EventRepository;
import com.dziesiedzieje.dziesiedzieje.repository.PlaceRepository;
import com.dziesiedzieje.dziesiedzieje.repository.PriceRepository;
import com.dziesiedzieje.dziesiedzieje.services.EventService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private PriceRepository priceRepository;

    @Autowired
    private PlaceRepository placeRepository;

    private EventEntityEventDtsMapper mapper =
            Mappers.getMapper(EventEntityEventDtsMapper.class);

    @Override
    public List<EventDts> findAllEvents() {
        return StreamSupport.stream(eventRepository.findAll().spliterator(), false)
                .map(eventEntity -> mapper.eventEntityToEventDts(eventEntity))
                .collect(Collectors.toList());
    }

    @Override
    public void addDummyEvent() {
        EventEntity eventEntity = new EventEntity();
        eventEntity.setId("b34bjsakmad");
        eventEntity.setName("Wlodi dance");
        eventEntity.setDate(new Date());
        eventEntity.setType("Pop");
        eventEntity.setPromoter("Zenon Martyniuk");

        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setMin(1);
        priceEntity.setMax(22);
        priceEntity.setType("cash");
        priceEntity.setCurrency("PLN");
        priceRepository.save(priceEntity);

        PlaceEntity placeEntity = new PlaceEntity();
        placeEntity.setAddress("Powstańców Sląskich 123");
        placeEntity.setCity("Wrocław");
        placeEntity.setPostalCode("71-231");
        placeEntity.setCountry("Poland");
        placeEntity.setName("Hala Spotkań");
        placeEntity.setLatitude("23423423,4234,2344");
        placeEntity.setLongitude("3425234,234423,423");
        placeRepository.save(placeEntity);

        eventEntity.setPlace(placeEntity);
        eventEntity.setPrice(priceEntity);
        eventRepository.save(eventEntity);
    }
}
