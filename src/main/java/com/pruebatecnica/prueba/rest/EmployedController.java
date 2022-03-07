package com.pruebatecnica.prueba.rest;

import com.pruebatecnica.prueba.entity.EmployedEntity;
import com.pruebatecnica.prueba.service.implement.EmployedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api/employed")
public class EmployedController {

  @Autowired
  private EmployedService employedService;


   @GetMapping("/getall")
    public ResponseEntity<List<EmployedEntity>> getEmployed() {
       List<EmployedEntity> response = employedService.getEmployed();
        if(response.size() > 0){
          return new ResponseEntity<>(response,HttpStatus.OK);
        }else{
          return new ResponseEntity<>(response,HttpStatus.NO_CONTENT);
        }

    }

    @PostMapping("/save")
    public ResponseEntity<String> saveEmploye(@RequestBody EmployedEntity employed){
        if(employedService.saveEmploye(employed)){
            return new ResponseEntity("ok",HttpStatus.CREATED);
        }
        return new ResponseEntity("El registro ya se encuentra en la BD",HttpStatus.NOT_ACCEPTABLE);
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<List<EmployedEntity>> getById(@PathVariable String id){
        List<EmployedEntity> response = employedService.getById(id);
        if(response.size() > 0){
            return new ResponseEntity<>(response,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/getbyname/{name}")
    public ResponseEntity<List<EmployedEntity>> getByNombres(@PathVariable String name){
        List<EmployedEntity> response = employedService.getByNombres(name);
        if(response.size() > 0){
            return new ResponseEntity<>(response,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/deletebyid/{id}")
    public ResponseEntity<String> delete(@PathVariable String id ){
        if(employedService.delete(id)){
            return new ResponseEntity<>("ok",HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmploye(@RequestBody EmployedEntity employed){
        if(employedService.updateEmploye(employed)){
            return new ResponseEntity<>("ok",HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
