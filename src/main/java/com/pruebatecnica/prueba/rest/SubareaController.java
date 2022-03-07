package com.pruebatecnica.prueba.rest;

import com.pruebatecnica.prueba.entity.SubareaEntity;
import com.pruebatecnica.prueba.service.implement.SubareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/api/subarea")
public class SubareaController {

    @Autowired
    private SubareaService subareaService;

    @GetMapping("/getall")
    public List<SubareaEntity> getSubarea(){
        return subareaService.getSubarea();
    }

    @PostMapping("/save")
    public void save(@RequestBody SubareaEntity subareaEntity){
        subareaService.save(subareaEntity);
    }

    @GetMapping("/getById/{id}")
    public Optional<SubareaEntity> getById(@PathVariable Long id){
        return subareaService.getById(id);
    }

    @GetMapping("/deletebyId/{id}")
    public void deleteById(@PathVariable Long id){
        subareaService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody SubareaEntity subareaEntity){
        subareaService.update(subareaEntity);
    }
}
