package com.example.ormactividadactual.entity.services;

import com.example.ormactividadactual.entity.dao.IComunidadAutonomaDao;
import com.example.ormactividadactual.entity.models.Comunidadautonoma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComunidadAutonomaServiceImpl implements IComunidadAutonomaService {

    @Autowired
    private IComunidadAutonomaDao comunidadAutonomaDao;

    @Override
    public Comunidadautonoma get(long id) {
        return comunidadAutonomaDao.findById(id).get();
    }

    @Override
    public List<Comunidadautonoma> getAll() {
        return (List<Comunidadautonoma>) comunidadAutonomaDao.findAll();
    }


    @Override
    public Comunidadautonoma add(Comunidadautonoma comunidadautonoma) {
        return comunidadAutonomaDao.save(comunidadautonoma);
    }

    @Override
    public void put(Comunidadautonoma comunidadautonoma, long id) {
        comunidadAutonomaDao.findById( id).ifPresent((x) -> {
            comunidadautonoma.setIdComunidad(id);
            comunidadAutonomaDao.save(comunidadautonoma);
        });
    }

    @Override
    public void delete(long id) {
comunidadAutonomaDao.deleteById(id);
    }
}
