package com.healthview.api.services;

import com.healthview.api.dao.CRUD;
import com.healthview.api.models.recomendaciones;
import com.healthview.api.repositories.recomendacionesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class recomendacionesService extends CRUD<recomendaciones, recomendacionesRepository> {

    public recomendacionesService(recomendacionesRepository repository){super(repository);}

    @Override
    public List<recomendaciones> list() { return repository.findAll(); }

    @Override
    public recomendaciones get(int id) { return repository.findById(id).get();}

    @Override
    public void add(recomendaciones o) { repository.save(o); }

    @Override
    public void update(recomendaciones o, int id) {

        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) { repository.deleteById(id);}
}
