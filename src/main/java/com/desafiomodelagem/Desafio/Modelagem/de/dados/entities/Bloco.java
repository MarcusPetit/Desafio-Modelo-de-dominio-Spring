package com.desafiomodelagem.Desafio.Modelagem.de.dados.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "bloco")
public class Bloco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}