package com.dziesiedzieje.dziesiedzieje.entity;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "PLACE")
public class PlaceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 45, nullable = false)
    private String name;

    @Column(name = "POSTAL_CODE", length = 6)
    private String postalCode;

    @Column(name = "ADRESS", length = 100, nullable = false)
    private String address;

    @Column(name = "COUNTRY", length = 45, nullable = false)
    private String country;

    @Column(name = "CITY", length = 45, nullable = false)
    private String city;

    @Column(name = "LATITUDE", length = 20)
    private String latitude;

    @Column(name = "LONGITUDE", length = 20)
    private String longitude;

/*    @OneToMany(mappedBy = "place")
    private Collection<EventEntity> events;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

/*    public Collection<EventEntity> getEvents() {
        return events;
    }

    public void setEvents(Collection<EventEntity> events) {
        this.events = events;
    }*/
}
