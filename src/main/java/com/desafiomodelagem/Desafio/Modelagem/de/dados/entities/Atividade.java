package com.desafiomodelagem.Desafio.Modelagem.de.dados.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_atividade")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;
    @ManyToMany
    @JoinTable(
            name = "participante_atividade",
            joinColumns = @JoinColumn(name = "atividade_id"),
            inverseJoinColumns = @JoinColumn(name = "participante_id")
    )
    private List<Participante> participantes;

    @OneToMany(mappedBy = "atividade")
    private List<Categoria> categorias;

    public Atividade() {
    }

    public Atividade(Integer id, String nome, String descricao, Double preco, List<Participante> participantes, List<Categoria> categorias) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.participantes = participantes;
        this.categorias = categorias;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atividade atividade = (Atividade) o;
        return Objects.equals(id, atividade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}