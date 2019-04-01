package com.dziesiedzieje.dziesiedzieje.mapper;

import com.dziesiedzieje.dziesiedzieje.entity.EventEntity;
import com.dziesiedzieje.dziesiedzieje.mapper.dts.EventDts;
import org.mapstruct.Mapper;

@Mapper
public interface EventEntityEventDtsMapper {


    EventDts eventEntityToEventDts(EventEntity eventEntity);

    EventEntity eventDtsToEventEntity(EventDts eventDts);
}
