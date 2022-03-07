package com.pruebatecnica.prueba.repository;

import com.pruebatecnica.prueba.entity.DocumentTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentTypeRepository extends JpaRepository<DocumentTypeEntity, Long> {
}
