package com.dziesiedzieje.dziesiedzieje.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Data
@Entity
@Table(name = "PRICE")
public class PriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TYPE", length = 45, nullable = false)
    private String type;

    @Column(name = "CURRENCY", length = 45, nullable = false)
    private String currency;

    @Column(name = "MIN", length = 10)
    private int min;

    @Column(name = "MAX", length = 10, nullable = false)
    private int max;

/*    @OneToMany(mappedBy = "price")
    private Collection<EventEntity> events;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

/*    public Collection<EventEntity> getEvents() {
        return events;
    }

    public void setEvents(Collection<EventEntity> events) {
        this.events = events;
    }*/
}

