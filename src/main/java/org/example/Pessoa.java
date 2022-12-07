package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;
    private String sobrenome;

    private String cnh;
    private LocalDate dataDeNascimento;

    Carro[] carros;

    public Pessoa(String nome, String sobrenome, String cnh) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String saudacao() {
        return String.format("Olá. Meu nome é %s %s e tenho %d anos.", nome, sobrenome, dataDeNascimento.until(LocalDate.now(), ChronoUnit.YEARS));
    }
}
