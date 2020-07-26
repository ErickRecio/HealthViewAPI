package com.healthview.api.restcontrollers;

import com.healthview.api.models.historial;
import com.healthview.api.services.historialService;
import com.healthview.api.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.HISTORIAL)
public class historialRestController {

    @Autowired
    historialService service;

    @GetMapping(Routes.LIST)
    public List<historial> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public historial findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody historial histA1){
        service.add(histA1);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody historial histA1, @PathVariable int id){

        service.update(histA1, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
