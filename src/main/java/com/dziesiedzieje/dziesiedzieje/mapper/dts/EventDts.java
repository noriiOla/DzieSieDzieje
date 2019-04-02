package com.dziesiedzieje.dziesiedzieje.mapper.dts;

import com.dziesiedzieje.dziesiedzieje.mapper.dto.PlaceDto;
import com.dziesiedzieje.dziesiedzieje.mapper.dto.PriceDto;
import lombok.Data;

import java.util.Date;

public class EventDts {

    private String id;

    private String name;

    private String image;

    private Date date;

    private String type;

    private String promoter;

    private PriceDto price;

    private PlaceDto place;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPromoter() {
        return promoter;
    }

    public void setPromoter(String promoter) {
        this.promoter = promoter;
    }

    public PriceDto getPrice() {
        return price;
    }

    public void setPrice(PriceDto price) {
        this.price = price;
    }

    public PlaceDto getPlace() {
        return place;
    }

    public void setPlace(PlaceDto place) {
        this.place = place;
    }
}
