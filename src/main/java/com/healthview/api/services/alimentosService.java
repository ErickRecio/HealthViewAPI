package com.healthview.api.services;


import com.healthview.api.dao.CRUD;
import com.healthview.api.models.alimentos;
import com.healthview.api.repositories.alimentosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class alimentosService extends CRUD <alimentos, alimentosRepository> {

    public alimentosService(alimentosRepository repository){super(repository);}

    @Override
    public List<alimentos> list() { return repository.findAll(); }

    @Override
    public alimentos get(int id) { return repository.findById(id).get();}

    @Override
    public void add(alimentos o) { repository.save(o); }

    @Override
    public void update(alimentos o, int id) {

        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) { repository.deleteById(id);}
}
