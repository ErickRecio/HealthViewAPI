package com.healthview.api.restcontrollers;
import com.healthview.api.models.datosUsuario;
import com.healthview.api.services.datosUsuarioService;
import com.healthview.api.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.DATOSUSUARIO)
public class datosUsuarioRestController {

    @Autowired
    datosUsuarioService service;

    @GetMapping(Routes.LIST)
    public List<datosUsuario> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public datosUsuario findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody datosUsuario datosU){
        service.add(datosU);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody datosUsuario datosU, @PathVariable int id){

        service.update(datosU, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
