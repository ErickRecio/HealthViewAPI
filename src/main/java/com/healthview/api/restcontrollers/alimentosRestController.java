package com.healthview.api.restcontrollers;

import com.healthview.api.models.alimentos;
import com.healthview.api.services.alimentosService;
import com.healthview.api.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.ALIMENTOS)
public class alimentosRestController {

    @Autowired
    alimentosService service;

    @GetMapping(Routes.LIST)
    public List<alimentos> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public alimentos findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody alimentos alimento){
        service.add(alimento);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody alimentos alimento, @PathVariable int id){

        service.update(alimento, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
