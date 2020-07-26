package com.healthview.api.services;

import com.healthview.api.dao.CRUD;
import com.healthview.api.models.dieta;
import com.healthview.api.repositories.dietaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class dietaService extends CRUD<dieta, dietaRepository> {

    public dietaService(dietaRepository repository){super(repository);}

    @Override
    public List<dieta> list() { return repository.findAll(); }

    @Override
    public dieta get(int id) { return repository.findById(id).get();}

    @Override
    public void add(dieta o) { repository.save(o); }

    @Override
    public void update(dieta o, int id) {

        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) { repository.deleteById(id);}
}