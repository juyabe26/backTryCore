package com.hightechsoftware.prueba.prueba.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cat_genero")
public class Genero {

    @Id
    @Column(name = "id_genero")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cat_genero_generator")
    @SequenceGenerator(sequenceName = "seq_id_genero", name = "cat_genero_generator", allocationSize = 1)
    private Integer id;

    @Column(name = "cod_genero")
    private String codigo;

    @Column(name = "des_genero")
    private String descripcion;

}
