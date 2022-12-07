package org.example;

import org.example.telas.TelaCadastroPessoa;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        TelaCadastroPessoa telaCadastroPessoa = new TelaCadastroPessoa();
        telaCadastroPessoa.pegarDadosUsuario();
        telaCadastroPessoa.informarDadosUsuario();

        /*
        Carro fusca = new Carro();
        fusca.cor = "preto";
        fusca.marca = "VW";
        fusca.placa = "MCJ-2340";
        fusca.motorista = pessoa;

        System.out.printf(fusca.apresentar());
        */
    }
}
