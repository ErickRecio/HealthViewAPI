package com.healthview.api.services;

import com.healthview.api.dao.CRUD;
import com.healthview.api.models.ejercicios;
import com.healthview.api.repositories.ejerciciosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ejerciciosService extends CRUD<ejercicios, ejerciciosRepository> {

    public ejerciciosService(ejerciciosRepository repository){super(repository);}

    @Override
    public List<ejercicios> list() { return repository.findAll(); }

    @Override
    public ejercicios get(int id) { return repository.findById(id).get();}

    @Override
    public void add(ejercicios o) { repository.save(o); }

    @Override
    public void update(ejercicios o, int id) {

        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) { repository.deleteById(id);}
}