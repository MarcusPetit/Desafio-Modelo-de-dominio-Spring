package com.desafiomodelagem.Desafio.Modelagem.de.dados.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String descricao;
    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    public Categoria() {
    }

    public Categoria(Integer id, String descricao, Atividade atividade) {
        this.id = id;
        this.descricao = descricao;
        this.atividade = atividade;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}