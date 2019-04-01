package com.dziesiedzieje.dziesiedzieje.mapper;

import com.dziesiedzieje.dziesiedzieje.entity.PlaceEntity;
import com.dziesiedzieje.dziesiedzieje.mapper.dto.PlaceDto;
import org.mapstruct.Mapper;

@Mapper
public interface PlaceEntityPlaceDtoMapper {


    PlaceDto placeEntityToPlaceDto(PlaceEntity placeEntity);

    PlaceEntity placeDtoToPlaceEntity(PlaceDto placeDto);
}
