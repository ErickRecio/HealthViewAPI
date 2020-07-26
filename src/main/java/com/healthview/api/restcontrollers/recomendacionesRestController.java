package com.healthview.api.restcontrollers;

import com.healthview.api.models.recomendaciones;
import com.healthview.api.services.recomendacionesService;
import com.healthview.api.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.RECOMENDACIONES)
public class recomendacionesRestController {

    @Autowired
    recomendacionesService service;

    @GetMapping(Routes.LIST)
    public List<recomendaciones> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public recomendaciones findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody recomendaciones recc){
        service.add(recc);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody recomendaciones recc, @PathVariable int id){

        service.update(recc, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
