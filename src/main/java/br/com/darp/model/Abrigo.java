package br.com.darp.model;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Abrigo {
    private Long id;
    private String nome;
    public Abrigo(){}
    public Abrigo(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "id: " + id +
                "\nnome: " + nome;
    }
}
