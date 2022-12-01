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
        Pessoa pessoa = new Pessoa(leitor.next());
        System.out.print("Digite seu sobrenome: ");
        pessoa.setSobrenome(leitor.next());
        System.out.print("Digite sua data de nascimento: ");
        pessoa.setDataDeNascimento(LocalDate.parse(leitor.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.printf(pessoa.saudacao());

    }
}
