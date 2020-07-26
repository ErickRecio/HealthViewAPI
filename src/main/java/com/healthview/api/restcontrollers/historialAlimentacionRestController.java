package com.healthview.api.restcontrollers;

import com.healthview.api.models.historialAlimentacion;
import com.healthview.api.services.historialAlimentacionService;
import com.healthview.api.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.HISTORIALALIMENTACION)
public class historialAlimentacionRestController {

    @Autowired
    historialAlimentacionService service;

    @GetMapping(Routes.LIST)
    public List<historialAlimentacion> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public historialAlimentacion findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody historialAlimentacion histA){
        service.add(histA);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody historialAlimentacion histA, @PathVariable int id){

        service.update(histA, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
