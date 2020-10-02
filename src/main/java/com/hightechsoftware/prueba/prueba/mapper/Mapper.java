package com.hightechsoftware.prueba.prueba.mapper;


import com.hightechsoftware.prueba.prueba.domain.Persona;
import com.hightechsoftware.prueba.prueba.rest.vo.PersonaVO;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

@Component
public class Mapper extends ConfigurableMapper {
    protected void configure(MapperFactory factory) {
        factory.classMap(Persona.class, PersonaVO.class)
            .field("genero.id", "idGenero")
            .field("planeta.id", "idPlaneta")
            .byDefault()
            .register();
    }
}
