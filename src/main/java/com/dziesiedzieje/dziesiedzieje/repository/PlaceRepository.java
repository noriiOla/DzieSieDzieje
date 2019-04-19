package com.dziesiedzieje.dziesiedzieje.repository;

import com.dziesiedzieje.dziesiedzieje.entity.PlaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends JpaRepository<PlaceEntity, Long> {
}
