package org.example.telas;

import org.example.entidades.Pessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TelaCadastroPessoa {

    Pessoa pessoa;

    public void pegarDadosUsuario() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu primeiro nome: ");
        String nome = leitor.next();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = leitor.next();
        System.out.print("Informe o CNH: ");
        String cnh = leitor.next();
        System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
        pessoa = new Pessoa(nome, sobrenome, cnh);
        pessoa.setDataDeNascimento(LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public void informarDadosUsuario() {
        System.out.printf(pessoa.saudacao());
    }
}
