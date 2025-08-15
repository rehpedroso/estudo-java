/*
    2. Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
   - fórmula: área=lado X lado
 */

package exercicios.fundamentos_linguagem;

import java.util.Scanner;

public class areaQuadrado {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("\nInsira o tamanho do quadrado: ");
        var lado = scanner.nextInt();

        var area = lado * lado ;

        System.out.printf("\nArea do quadrado é: %s\n\n", area);

        scanner.close();
    }
}