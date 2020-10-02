package com.hightechsoftware.prueba.prueba.repository;

import com.hightechsoftware.prueba.prueba.domain.Genero;
import com.hightechsoftware.prueba.prueba.domain.Planeta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository extends JpaRepository<Genero,Integer> {
}
