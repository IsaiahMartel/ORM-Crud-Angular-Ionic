package com.example.ormactividadactual.controllers;


import com.example.ormactividadactual.entity.services.ComunidadAutonomaServiceImpl;
import com.example.ormactividadactual.entity.models.Comunidadautonoma;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ControllerComunidad {

    @Autowired
    ComunidadAutonomaServiceImpl comunidadAutonomaService;

    //@GetMapping(value = "/comunidades" , consumes = "application/json")
    @GetMapping("/comunidadautonoma")
    public List<Comunidadautonoma> getAllComunidades() {
        return comunidadAutonomaService.getAll();
    }


    @GetMapping("/comunidadautonoma/{idComunidad}")
    public Comunidadautonoma getOne(@PathVariable(value = "idComunidad") long id){
        return comunidadAutonomaService.get(id);
    }

    //@PostMapping(value = "/comunidadautonoma" , consumes = "application/json" )
    @PostMapping("/comunidadautonoma")
    public Comunidadautonoma add(Comunidadautonoma comunidadautonoma) {
        /*System.out.println(comunidadautonomaString);
        ObjectMapper om = new ObjectMapper();
        Comunidadautonoma comunidadAutonoma = om.readValue(comunidadautonomaString, Comunidadautonoma.class);*/

        return comunidadAutonomaService.add(comunidadautonoma);

    }

    @PutMapping("/comunidadautonoma/{idComunidad}")
    public void update(Comunidadautonoma comunidadautonoma, @PathVariable(value = "idComunidad") long id){
        comunidadAutonomaService.put(comunidadautonoma, id);
    }

    @DeleteMapping("/comunidadautonoma/{idComunidad}")
    public void delete(@PathVariable(value = "idComunidad") long id){

        System.out.println(id + "borrarrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        comunidadAutonomaService.delete(id);
    }
}




