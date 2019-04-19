package com.dziesiedzieje.dziesiedzieje.repository;

import com.dziesiedzieje.dziesiedzieje.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PriceRepository extends JpaRepository<PriceEntity, Long> {
}
