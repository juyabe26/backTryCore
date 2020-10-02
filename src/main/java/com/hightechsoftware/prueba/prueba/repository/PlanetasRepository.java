package com.hightechsoftware.prueba.prueba.repository;

import com.hightechsoftware.prueba.prueba.domain.Planeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetasRepository extends JpaRepository<Planeta,Integer> {

}
