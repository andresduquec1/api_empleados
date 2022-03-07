package com.pruebatecnica.prueba.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "employed")
public class EmployedEntity {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    private String id;

    @Column
    private String documentType;

    @Column
    private String names;

    @Column
    private String lastNames;

    @Column
    private String area;

    @Column
    private String subarea;

}
