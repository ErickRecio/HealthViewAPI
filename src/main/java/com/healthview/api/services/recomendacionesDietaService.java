package com.healthview.api.services;

import com.healthview.api.dao.CRUD;
import com.healthview.api.models.recomendacionesDieta;
import com.healthview.api.repositories.recomendacionesDietaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class recomendacionesDietaService extends CRUD<recomendacionesDieta, recomendacionesDietaRepository> {

    public recomendacionesDietaService(recomendacionesDietaRepository repository){super(repository);}

    @Override
    public List<recomendacionesDieta> list() { return repository.findAll(); }

    @Override
    public recomendacionesDieta get(int id) { return repository.findById(id).get();}

    @Override
    public void add(recomendacionesDieta o) { repository.save(o); }

    @Override
    public void update(recomendacionesDieta o, int id) {

        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) { repository.deleteById(id);}
}