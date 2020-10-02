package com.hightechsoftware.prueba.prueba.repository;

import com.hightechsoftware.prueba.prueba.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Integer> {

    @Query("SELECT p FROM Persona p JOIN FETCH p.planeta pl WHERE p.uid = ?1")
    Persona buscarPersona(String uid);

    @Query("SELECT p FROM Persona p JOIN FETCH p.planeta pl WHERE pl.id = ?1")
    List<Persona> buscarPersonasPorIdPlaneta(Integer idPlaneta);

    @Query("SELECT p FROM Persona p JOIN FETCH p.planeta pl WHERE p.id = ?1")
    Persona buscarIdPersona(Integer id);
}
