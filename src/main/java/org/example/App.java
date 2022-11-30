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
        String nome = leitor.next();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = leitor.next();
        System.out.print("Digite sua data de nascimento: ");
        LocalDate dataDeNascimento = LocalDate.parse(leitor.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Pessoa pessoa = new Pessoa(nome, sobrenome, dataDeNascimento);
        System.out.printf("Olá. Meu nome é %s %s e tenho %d anos.", nome, sobrenome, dataDeNascimento.until(LocalDate.now(), ChronoUnit.YEARS));

    }
}
