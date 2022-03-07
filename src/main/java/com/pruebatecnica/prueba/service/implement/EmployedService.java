package com.pruebatecnica.prueba.service.implement;

import com.pruebatecnica.prueba.entity.EmployedEntity;
import com.pruebatecnica.prueba.repository.EmployedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployedService {

    @Autowired
    private EmployedRepository employedRepository;

    public List<EmployedEntity> getEmployed() {
        List<EmployedEntity> response = employedRepository.findAll();
        return response;
    }

    public boolean saveEmploye(EmployedEntity employed){
           Optional<EmployedEntity> employed1 = employedRepository.findById(employed.getId());
           if(employed1.isEmpty()){
               employedRepository.save(employed);
               return true;
           }else{
               return false;
           }

    }

    public List<EmployedEntity> getById(String id){
        Optional<EmployedEntity> response = employedRepository.findById(id);
        List responseList = new ArrayList();
        responseList.add(response);
        return responseList;
    }

    public List<EmployedEntity> getByNombres(String name){
        List responseList = new ArrayList();
        List<EmployedEntity> response = employedRepository.findByNamesContainingIgnoreCase(name);
        responseList.add(response);
        return responseList;
    }

    public boolean delete(String id ){
        try {
            employedRepository.deleteById(id);
            return true;
        }catch (Exception e){
         return false;
        }
    }

    public boolean updateEmploye(EmployedEntity employed){
        try {
            employedRepository.save(employed);
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
