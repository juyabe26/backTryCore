package com.hightechsoftware.prueba.prueba.service;

import com.hightechsoftware.prueba.prueba.domain.Genero;
import com.hightechsoftware.prueba.prueba.domain.Persona;
import com.hightechsoftware.prueba.prueba.domain.Planeta;
import com.hightechsoftware.prueba.prueba.repository.GeneroRepository;
import com.hightechsoftware.prueba.prueba.repository.PersonaRepository;
import com.hightechsoftware.prueba.prueba.repository.PlanetasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private PlanetasRepository planetasRepository;
    @Autowired
    private GeneroRepository generoRepository;

    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public Persona buscarPersona(String uid, Integer id) {
        if(id != null){
            editarContadorPersona(id);
            return personaRepository.buscarIdPersona(id);
        }
        return personaRepository.buscarPersona(uid);
    }

    public List<Persona> buscarPersonasPorIdPlaneta(Integer idPlaneta) {
        return personaRepository.buscarPersonasPorIdPlaneta(idPlaneta);
    }

    public List<Planeta> buscarPlanetas() {
        return planetasRepository.findAll();
    }

    public List<Genero> buscargeneros() {
        return generoRepository.findAll();
    }

    public String editarContadorPersona(Integer idPersona) {
        Optional<Persona> persona = personaRepository.findById(idPersona);
        if(persona.isPresent()){
            if(persona.get().getContador() == null){
                persona.get().setContador(1);
            }else{
                persona.get().setContador(persona.get().getContador() + 1);
            }
            personaRepository.save(persona.get());
            return "Contado";
        }else{
            return "No encontrado";
        }

    }

    public String editarContadorPlaneta(Integer idPlaneta) {
        Optional<Planeta> plantea = planetasRepository.findById(idPlaneta);
        if(plantea.isPresent()){
            if(plantea.get().getContador() == null){
                plantea.get().setContador(1);
            }else{
                plantea.get().setContador(plantea.get().getContador()+1);
            }
            planetasRepository.save(plantea.get());
            return "Contado";
        }else{
            return "No encontrado";
        }
    }
}
