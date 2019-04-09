package com.dziesiedzieje.dziesiedzieje.services.impl;

import com.dziesiedzieje.dziesiedzieje.mapper.PlaceEntityPlaceDtoMapper;
import com.dziesiedzieje.dziesiedzieje.mapper.dto.PlaceDto;
import com.dziesiedzieje.dziesiedzieje.repository.PlaceRepository;
import com.dziesiedzieje.dziesiedzieje.services.PlaceService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    private PlaceEntityPlaceDtoMapper mapper =
            Mappers.getMapper(PlaceEntityPlaceDtoMapper.class);

    @Override
    public List<PlaceDto> findAllPlaces() {
        return StreamSupport.stream(placeRepository.findAll().spliterator(), false)
                .map(placeEntity -> mapper.placeEntityToPlaceDto(placeEntity))
                .collect(Collectors.toList());
    }
}
