package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Pessoa {
    String nome;
    String sobrenome;
    LocalDate dataDeNascimento;

    public void saldacao(){
        int idade = LocalDate.now().getYear() - dataDeNascimento.getYear();
        System.out.println("Olá "+nome+" "+sobrenome+", sua idade é "+idade);

    }
}
