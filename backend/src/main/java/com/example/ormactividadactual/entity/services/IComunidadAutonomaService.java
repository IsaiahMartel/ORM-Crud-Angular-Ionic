package com.example.ormactividadactual.entity.services;

import com.example.ormactividadactual.entity.models.Comunidadautonoma;

import java.util.List;
import java.util.Optional;

public interface IComunidadAutonomaService {
    //Optional<Comunidadautonoma> getByID(int idComunidad);

    Comunidadautonoma get(long id);

    List<Comunidadautonoma> getAll();


    Comunidadautonoma add(Comunidadautonoma comunidadautonoma);

    void put(Comunidadautonoma comunidadautonoma, long id);

    void delete(long id);
}
