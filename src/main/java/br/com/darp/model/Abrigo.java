package br.com.darp.model;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Random;

@ApplicationScoped
public class Abrigo {
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    Random gerador = new Random();
    public Abrigo(){ this.id = gerador.nextLong();}
    public Abrigo(String nome, String telefone, String email){
        this.id = gerador.nextLong();
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "id: " + id +
                "\nnome: " + nome +
                "\ntelefone:" + telefone +
                "\nemail: " + email;
    }
}
