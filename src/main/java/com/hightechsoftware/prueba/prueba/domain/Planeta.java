package com.hightechsoftware.prueba.prueba.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cat_planetas")
public class Planeta {

    @Id
    @Column(name = "id_planeta")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cat_planetas_generator")
    @SequenceGenerator(sequenceName = "seq_id_planeta", name = "cat_planetas_generator", allocationSize = 1)
    private Integer id;

    @Column(name = "cod_planeta")
    private String codigo;

    @Column(name = "des_planeta")
    private String description;

    @Column(name = "contador")
    private Integer contador;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }
}
