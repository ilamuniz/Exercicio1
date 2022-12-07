package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        System.out.print("Digite seu sobrenome: ");
        System.out.println("Informe o CNH: ");
        Pessoa pessoa = new Pessoa(leitor.next(), leitor.next(), leitor.next());
        pessoa.setSobrenome(leitor.next());

        Carro fusca = new Carro();
        fusca.cor = "preto";
        fusca.marca = "VW";
        fusca.placa = "MCJ-2340";
        fusca.motorista = pessoa;

        System.out.print("Digite sua data de nascimento: ");
        pessoa.setDataDeNascimento(LocalDate.parse(leitor.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.printf(pessoa.saudacao());
        System.out.printf(fusca.apresentar());

    }
}
