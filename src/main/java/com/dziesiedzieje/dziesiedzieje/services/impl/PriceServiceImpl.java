package com.dziesiedzieje.dziesiedzieje.services.impl;

import com.dziesiedzieje.dziesiedzieje.mapper.PriceEntityPriceDtoMapper;
import com.dziesiedzieje.dziesiedzieje.mapper.dto.PriceDto;
import com.dziesiedzieje.dziesiedzieje.repository.PriceRepository;
import com.dziesiedzieje.dziesiedzieje.services.PriceService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceRepository priceRepository;

    private PriceEntityPriceDtoMapper mapper
            = Mappers.getMapper(PriceEntityPriceDtoMapper.class);

    @Override
    public List<PriceDto> findAllPrices() {
        return StreamSupport.stream(priceRepository.findAll().spliterator(), false)
                .map(priceEntity -> mapper.priceEntityToPriceDto(priceEntity))
                .collect(Collectors.toList());
    }
}
