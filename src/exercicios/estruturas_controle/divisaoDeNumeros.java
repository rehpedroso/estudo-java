/*
    4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de  0 na divisão, números menores que o primeiro número devem ser ignorados
 */

package exercicios.estruturas_controle;

import java.util.Scanner;

public class divisaoDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um numero inicial: ");
        int numero_inicial = scanner.nextInt();
              
        while (true) {

            System.out.print("\nDigite o numero desejado: ");
            int numeros = scanner.nextInt();

            if (numeros < numero_inicial) {
                System.out.printf("\nNumero ignorado!\nO numero precisa ser maior que %s\n", numero_inicial);
                continue;
            }

            if (numeros % numero_inicial == 0) {
                System.out.printf("\nO numero %s e divisivel por %s\n", numeros, numero_inicial);
            }
            else{
                System.out.printf("\nO numero %s nao e divisivel por %s.\nEncerrando o programa\n\n", numeros, numero_inicial);
                break;
            }
        }

        scanner.close();
    }
}
