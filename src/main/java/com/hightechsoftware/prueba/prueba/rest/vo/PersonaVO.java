package com.hightechsoftware.prueba.prueba.rest.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

@Getter
@Setter
public class PersonaVO {
    private Integer id;
    private String primerNombre;
    private String primerApellido;
    private String segundoNombre;
    private String segundoApellido;
    private Date fechaNacimiento;
    private Integer identificacion;
    private String direccion;
    private Long telefono;
    private Integer idGenero;
    private String uid;
    private Integer idPlaneta;
    private Integer edad;
    private Integer peso;
    private Integer contador;
}
