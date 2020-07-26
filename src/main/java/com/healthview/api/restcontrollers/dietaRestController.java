package com.healthview.api.restcontrollers;

import com.healthview.api.models.dieta;
import com.healthview.api.services.dietaService;
import com.healthview.api.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.DIETA)
public class dietaRestController {

    @Autowired
    dietaService service;

    @GetMapping(Routes.LIST)
    public List<dieta> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public dieta findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody dieta diet){
        service.add(diet);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody dieta diet, @PathVariable int id){

        service.update(diet, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
