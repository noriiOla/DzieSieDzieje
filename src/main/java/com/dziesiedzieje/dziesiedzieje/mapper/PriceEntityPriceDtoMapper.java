package com.dziesiedzieje.dziesiedzieje.mapper;

import com.dziesiedzieje.dziesiedzieje.entity.PriceEntity;
import com.dziesiedzieje.dziesiedzieje.mapper.dto.PriceDto;
import org.mapstruct.Mapper;

@Mapper
public interface PriceEntityPriceDtoMapper {

    PriceDto priceEntityToPriceDto(PriceEntity priceEntity);

    PriceEntity priceDtoToPriceEntity(PriceDto priceDto);
}
