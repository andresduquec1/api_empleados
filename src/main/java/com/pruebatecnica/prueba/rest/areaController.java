package com.pruebatecnica.prueba.rest;

import com.pruebatecnica.prueba.entity.AreaEntity;
import com.pruebatecnica.prueba.service.implement.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/api/area")
public class areaController {

    @Autowired
    private AreaService areaService;

    @GetMapping("/getall")
    public List<AreaEntity> getAarea(){
      return areaService.getArea();
    }

    @PostMapping("/save")
    public void save(@RequestBody AreaEntity areaEntity){
        areaService.save(areaEntity);
    }

    @GetMapping("/getById/{id}")
    public Optional<AreaEntity> getById(@PathVariable Long id){
        return areaService.getById(id);
    }

    @GetMapping("/deletebyId/{id}")
    public void deleteById(@PathVariable Long id){
        areaService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody AreaEntity areaEntity){
        areaService.update(areaEntity);
    }

}
