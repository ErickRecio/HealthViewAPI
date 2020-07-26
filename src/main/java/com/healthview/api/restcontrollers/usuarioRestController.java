package com.healthview.api.restcontrollers;

import com.healthview.api.models.usuario;
import com.healthview.api.services.usuarioService;
import com.healthview.api.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.USUARIO)
public class usuarioRestController {

    @Autowired
    usuarioService service;

    @GetMapping(Routes.LIST)
    public List<usuario> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public usuario findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody usuario usu){
        service.add(usu);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody usuario usu, @PathVariable int id){

        service.update(usu, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
