package com.pruebatecnica.prueba.service.implement;

import com.pruebatecnica.prueba.entity.DocumentTypeEntity;
import com.pruebatecnica.prueba.repository.DocumentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentTypeService {

    @Autowired
    private DocumentTypeRepository document;

    public List<DocumentTypeEntity> getArea(){
        return document.findAll();
    }

    public void save(DocumentTypeEntity documentType){
        if(document.findById(documentType.getId()).isEmpty()){
            document.save(documentType);
        }

    }

    public Optional<DocumentTypeEntity> getById(Long id){
        return document.findById(id);
    }

    public void deleteById(Long id){
        document.deleteById(id);
    }

    public void update(DocumentTypeEntity documentType){
        document.save(documentType);
    }
}
