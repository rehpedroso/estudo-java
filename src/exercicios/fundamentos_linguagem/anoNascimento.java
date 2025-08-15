/*
    1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
*/

package exercicios.fundamentos_linguagem;

import java.time.LocalDate;
import java.util.Scanner;

public class anoNascimento {
    public static void main(String[] args) {
        int anoAtual = LocalDate.now().getYear();
        var scanner = new Scanner(System.in);

        System.out.println("\nInsira o seu nome: ");
        var nome = scanner.next();
        System.out.println("\nInsira o ano do seu nascimento");
        var ano_nascimento = scanner.nextInt();

        var idade = anoAtual - ano_nascimento;

        System.out.printf("\n\nOla %s voce tem %s anos!\n\n", nome, idade);

        scanner.close();
    }
}

