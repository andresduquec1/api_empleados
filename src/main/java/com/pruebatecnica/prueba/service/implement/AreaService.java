package com.pruebatecnica.prueba.service.implement;

import com.pruebatecnica.prueba.entity.AreaEntity;
import com.pruebatecnica.prueba.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AreaService {

    @Autowired
    private AreaRepository areaRepository;

    public List<AreaEntity> getArea(){
       return areaRepository.findAll();
    }

    public void save(AreaEntity areaEntity){
        if(areaRepository.findById(areaEntity.getId()).isEmpty()){
            areaRepository.save(areaEntity);
        }

    }

    public Optional<AreaEntity> getById(Long id){
        return areaRepository.findById(id);
    }

    public void deleteById(Long id){
        areaRepository.deleteById(id);
    }

    public void update(AreaEntity areaEntity){
        areaRepository.save(areaEntity);
    }
}
