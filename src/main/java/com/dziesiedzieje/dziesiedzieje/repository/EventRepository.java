package com.dziesiedzieje.dziesiedzieje.repository;

import com.dziesiedzieje.dziesiedzieje.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventEntity, String> {
    EventEntity findOneById(String id);
}
