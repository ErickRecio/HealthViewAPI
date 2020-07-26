package com.healthview.api.services;

import com.healthview.api.dao.CRUD;
import com.healthview.api.models.datosUsuario;
import com.healthview.api.repositories.datosUsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class datosUsuarioService extends CRUD<datosUsuario, datosUsuarioRepository> {

    public datosUsuarioService(datosUsuarioRepository repository){super(repository);}

    @Override
    public List<datosUsuario> list() { return repository.findAll(); }

    @Override
    public datosUsuario get(int id) { return repository.findById(id).get();}

    @Override
    public void add(datosUsuario o) { repository.save(o); }

    @Override
    public void update(datosUsuario o, int id) {

        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) { repository.deleteById(id);}
}