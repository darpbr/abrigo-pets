package br.com.darp.model;

import java.util.Random;

public class Pet {
    private Long id;
    private String tipo;
    private String nome;
    private String raca;
    private int idade;
    private String cor;
    private Float peso;
    Random gerador = new Random();
    public Pet(){ this.id = gerador.nextLong();}

    public Pet(String tipo, String nome, String raca, int idade, String cor, Float peso) {
        this.id = gerador.nextLong();
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

    public Long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public Float getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "nome: " + nome +
                "\nraca: " + raca +
                "\npeso: " + peso;
    }
}
