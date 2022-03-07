package com.pruebatecnica.prueba.service.implement;

import com.pruebatecnica.prueba.entity.SubareaEntity;
import com.pruebatecnica.prueba.repository.SubareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubareaService {

    @Autowired
    private SubareaRepository subareaRepository;

    public List<SubareaEntity> getSubarea(){
        return subareaRepository.findAll();
    }

    public void save(SubareaEntity subareaEntity){
        if(subareaRepository.findById(subareaEntity.getId()).isEmpty()){
            subareaRepository.save(subareaEntity);
        }

    }

    public Optional<SubareaEntity> getById(Long id){
        return subareaRepository.findById(id);
    }

    public void deleteById(Long id){
        subareaRepository.deleteById(id);
    }

    public void update(SubareaEntity subareaEntity){
        subareaRepository.save(subareaEntity);
    }
}
