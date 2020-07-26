package com.healthview.api.services;

import com.healthview.api.dao.CRUD;
import com.healthview.api.models.historial;
import com.healthview.api.repositories.historialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class historialService extends CRUD<historial, historialRepository> {

    public historialService(historialRepository repository){super(repository);}

    @Override
    public List<historial> list() { return repository.findAll(); }

    @Override
    public historial get(int id) { return repository.findById(id).get();}

    @Override
    public void add(historial o) { repository.save(o); }

    @Override
    public void update(historial o, int id) {

        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) { repository.deleteById(id);}
}