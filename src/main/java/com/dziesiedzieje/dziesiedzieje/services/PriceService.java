package com.dziesiedzieje.dziesiedzieje.services;

import com.dziesiedzieje.dziesiedzieje.mapper.dto.PriceDto;

import java.util.List;

public interface PriceService {

    List<PriceDto> findAllPrices();
}
