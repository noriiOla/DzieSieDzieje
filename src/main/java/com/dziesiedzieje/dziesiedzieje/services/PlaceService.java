package com.dziesiedzieje.dziesiedzieje.services;

import com.dziesiedzieje.dziesiedzieje.mapper.dto.PlaceDto;

import java.util.List;

public interface PlaceService {

    List<PlaceDto> findAllPlaces();
}
