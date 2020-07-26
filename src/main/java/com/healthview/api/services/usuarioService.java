package com.healthview.api.services;

import com.healthview.api.dao.CRUD;
import com.healthview.api.models.usuario;
import com.healthview.api.repositories.usuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usuarioService extends CRUD<usuario, usuarioRepository> {

    public usuarioService(usuarioRepository repository){super(repository);}

    @Override
    public List<usuario> list() { return repository.findAll(); }

    @Override
    public usuario get(int id) { return repository.findById(id).get();}

    @Override
    public void add(usuario o) { repository.save(o); }

    @Override
    public void update(usuario o, int id) {

        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) { repository.deleteById(id);}
}