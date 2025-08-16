/*
    3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;
 */

package exercicios.estruturas_controle;

import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite um numero desejado: ");
        int numero1 = scanner.nextInt();
        
        int numero2;

        while (true) {
            System.out.print("\nDigite o segundo numero desejado: ");
            numero2 = scanner.nextInt();

            if (numero2 > numero1) {
                break;
            }
            else {
                System.out.printf("\nNumero invalido!\nDigite um numero que seja maior que %s\n", numero1);
            }
        }

        System.out.println("\n====== Escolha uma das opcoes: ======\n\n1. Par\n2. Impar");
        System.out.print("\nDigite a opcao desejada: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.printf("\n\n===== Numeros pares entre %d e %d (decrescente) =====\n\n", numero1, numero2);

            for (int i = numero2; i >= numero1; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.printf("\n\n===== Numeros impares entre %d e %d (decrescente) =====\n\n", numero1, numero2);

            for (int i = numero2; i >= numero1; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        
        System.out.print("\n");

        scanner.close();
    }
    
}
