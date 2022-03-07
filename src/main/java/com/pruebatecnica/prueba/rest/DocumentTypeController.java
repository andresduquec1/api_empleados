package com.pruebatecnica.prueba.rest;

import com.pruebatecnica.prueba.entity.DocumentTypeEntity;
import com.pruebatecnica.prueba.service.implement.DocumentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/api/documenttipe")
public class DocumentTypeController {

    @Autowired
    private DocumentTypeService documentTypeService;

    @GetMapping("/getall")
    public List<DocumentTypeEntity> getAarea(){
        return documentTypeService.getArea();
    }

    @PostMapping("/save")
    public void save(@RequestBody DocumentTypeEntity documentType){
        documentTypeService.save(documentType);
    }

    @GetMapping("/getById/{id}")
    public Optional<DocumentTypeEntity> getById(@PathVariable Long id){
        return documentTypeService.getById(id);
    }

    @GetMapping("/deletebyId/{id}")
    public void deleteById(@PathVariable Long id){
        documentTypeService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody DocumentTypeEntity documentType){
        documentTypeService.update(documentType);
    }

}
