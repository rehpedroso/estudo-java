/*
    3. Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
   - fórmula: área=base X altura
 */

package exercicios.fundamentos_linguagem;

import java.util.Scanner;

public class areaRetangulo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("\nInsira o valor da base do retangulo: ");
        var base = scanner.nextInt();
        System.out.println("\nInsira o valor da altura do retangulo: ");
        var altura = scanner.nextInt();

        var area = base * altura;

        System.out.printf("\nArea do retangulo é: %s\n\n", area);

        scanner.close();
    }
}