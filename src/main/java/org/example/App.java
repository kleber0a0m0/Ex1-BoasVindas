package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LocalDate dataDeNascimento;

        Scanner scanner = new Scanner(System.in);

        String nome,sobrenome;

        System.out.println("Digite o seu nome:");
        nome = scanner.nextLine();

        System.out.println("Digite o seu sobrenome:");
        sobrenome = scanner.nextLine();

        System.out.println("Digite a sua data de nascimento:");
        dataDeNascimento = LocalDate.parse(scanner.nextLine());






    }
}
