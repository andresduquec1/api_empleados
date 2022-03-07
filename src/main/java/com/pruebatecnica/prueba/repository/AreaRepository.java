package com.pruebatecnica.prueba.repository;

import com.pruebatecnica.prueba.entity.AreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<AreaEntity, Long> {
}
