package com.pruebatecnica.prueba.repository;


import com.pruebatecnica.prueba.entity.EmployedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployedRepository extends JpaRepository<EmployedEntity,String> {

    @Transactional(readOnly = true)
    List<EmployedEntity> findByNamesContainingIgnoreCase(String nombres);

}
