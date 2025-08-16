/*
    1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
 */

package exercicios.estruturas_controle;

import java.util.Scanner;

public class geraTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInsira o numero desejado: ");
        int numero = scanner.nextInt();

        System.out.printf("\n\n***** TABUADA DO %s *****\n", numero);

        for(int i = 1; i <= 10; i++) {
            int tabuada = numero * i;

            System.out.printf("\n%s * %s = %s", numero, i, tabuada);
        }

        System.out.print("\n");

        scanner.close();
    }
}
