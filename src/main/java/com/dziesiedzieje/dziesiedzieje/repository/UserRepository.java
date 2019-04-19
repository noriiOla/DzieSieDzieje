package com.dziesiedzieje.dziesiedzieje.repository;

import com.dziesiedzieje.dziesiedzieje.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findOneById(Long id);
}
