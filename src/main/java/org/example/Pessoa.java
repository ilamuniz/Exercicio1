package org.example;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private LocalDate dataDeNascimento;

    public Pessoa(String nome, String sobrenome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
