package com.healthview.api.restcontrollers;

import com.healthview.api.models.recomendacionesDieta;
import com.healthview.api.services.recomendacionesDietaService;
import com.healthview.api.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.RECOMENDACIONESDIETA)
public class recomendacionesDietaRestController {

    @Autowired
    recomendacionesDietaService service;

    @GetMapping(Routes.LIST)
    public List<recomendacionesDieta> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public recomendacionesDieta findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody recomendacionesDieta recDiet){
        service.add(recDiet);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody recomendacionesDieta recDiet, @PathVariable int id){

        service.update(recDiet, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
