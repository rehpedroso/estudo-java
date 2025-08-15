/*
    4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
 */

package exercicios.fundamentos_linguagem;

import java.util.Scanner;

public class diferencaIdade {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int diferenca;

        System.out.println("\nInsira o nome da primeira pessoa: ");
        var nome1 = scanner.next();
        System.out.printf("\nInsira a idade de %s: ", nome1);
        var idade1 = scanner.nextInt();
        System.out.println("\nInsira o nome da segunda pessoa: ");
        var nome2 = scanner.next();
        System.out.printf("\nInsira a idade de %s: ", nome2);
        var idade2 = scanner.nextInt();

        if (idade1 > idade2){
            diferenca = idade1 - idade2;
        }
        else {
            diferenca = idade2 - idade1;
        }
        

        System.out.printf("\nA diferenca da idade de %s e %s é de: %s anos\n\n", nome1, nome2, diferenca);

        scanner.close();
    }
}