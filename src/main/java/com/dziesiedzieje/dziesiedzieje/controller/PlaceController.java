package com.dziesiedzieje.dziesiedzieje.controller;

import com.dziesiedzieje.dziesiedzieje.mapper.dto.PlaceDto;
import com.dziesiedzieje.dziesiedzieje.services.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/places")
public class PlaceController {


    @Autowired
    PlaceService placeService;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<PlaceDto> getAllPrices() {
        return placeService.findAllPlaces();
    }
}