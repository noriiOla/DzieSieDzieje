package com.dziesiedzieje.dziesiedzieje.controller;


import com.dziesiedzieje.dziesiedzieje.mapper.dto.PriceDto;
import com.dziesiedzieje.dziesiedzieje.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/prices")
public class PriceController {


    @Autowired
    PriceService priceService;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<PriceDto> getAllPrices() {
        return priceService.findAllPrices();
    }
}
