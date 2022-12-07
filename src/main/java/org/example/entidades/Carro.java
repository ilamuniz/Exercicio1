package org.example.entidades;

import org.example.entidades.Pessoa;

public class Carro {

    String placa;
    String cor;
    String marca;
    Pessoa motorista;

    String apresentar() {
        return String.format("Carro de placa %s é dirigido por %s %n Especificação do motorista %s",
        placa,motorista.setNome(motorista.saudacao()));
    }

}
