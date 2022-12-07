package org.example.entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;
    private String sobrenome;

    private String cnh;
    private LocalDate dataDeNascimento;

    private Carro[] carros;

    public Pessoa(String nome, String sobrenome, String cnh) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
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
        return String.format("Olá. Meu nome é %s %s, tenho %d anos e meu cnh é %s.", nome, sobrenome, dataDeNascimento.until(LocalDate.now(), ChronoUnit.YEARS), cnh);
    }
}
