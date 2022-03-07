package com.pruebatecnica.prueba.repository;

import com.pruebatecnica.prueba.entity.SubareaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubareaRepository extends JpaRepository<SubareaEntity, Long> {
}
