package com.healthview.api.services;

import com.healthview.api.dao.CRUD;
import com.healthview.api.models.historialAlimentacion;
import com.healthview.api.repositories.historialAlimentacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class historialAlimentacionService extends CRUD<historialAlimentacion, historialAlimentacionRepository> {

    public historialAlimentacionService(historialAlimentacionRepository repository){super(repository);}

    @Override
    public List<historialAlimentacion> list() { return repository.findAll(); }

    @Override
    public historialAlimentacion get(int id) { return repository.findById(id).get();}

    @Override
    public void add(historialAlimentacion o) { repository.save(o); }

    @Override
    public void update(historialAlimentacion o, int id) {

        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) { repository.deleteById(id);}
}
