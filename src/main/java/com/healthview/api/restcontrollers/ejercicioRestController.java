package com.healthview.api.restcontrollers;

import com.healthview.api.models.ejercicios;
import com.healthview.api.services.ejerciciosService;
import com.healthview.api.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.EJERCICIOS)
public class ejercicioRestController {

    @Autowired
    ejerciciosService service;

    @GetMapping(Routes.LIST)
    public List<ejercicios> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public ejercicios findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody ejercicios ejerx){
        service.add(ejerx);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody ejercicios ejerx, @PathVariable int id){

        service.update(ejerx, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
