package com.dziesiedzieje.dziesiedzieje.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EVENT")
public class EventEntity {

    @Id
    String id;

    @Column(name = "NAME", length = 45, nullable = false)
    String name;

    @Column(name = "IMAGE")
    String image;

    @Column(name = "DATE")
    Date date;

    @Column(name = "TYPE", length = 45)
    String type;

    @Column(name = "PROMOTER", length = 45)
    String promoter;

    @ManyToOne(
            optional = false,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "PRICE_ID")
    PriceEntity price;

    @ManyToOne(
            optional = false,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "PLACE_ID")
    PlaceEntity place;

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

    public PriceEntity getPrice() {
        return price;
    }

    public void setPrice(PriceEntity price) {
        this.price = price;
    }

    public PlaceEntity getPlace() {
        return place;
    }

    public void setPlace(PlaceEntity place) {
        this.place = place;
    }
}
