/*
    2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
        - Se for menor ou igual a 18,5 "Abaixo do peso";
        - se for entre 18,6 e 24,9 "Peso ideal";
        - Se for entre 25,0 e 29,9 "Levemente acima do peso";
        - Se for entre 30,0 e 34,9 "Obesidade Grau I";
        - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
        - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
 */

package exercicios.estruturas_controle;

import java.util.Scanner;

public class calculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nInsira a sua altura: ");
        float altura = scanner.nextFloat();
        System.out.print("\nInsira o seu peso: ");
        float peso = scanner.nextFloat();

        float imc = peso/(altura * altura);

        if (imc <= 18.5) {
            System.out.println("\n\nAbaixo do peso");
        }
        else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("\n\nPeso ideal");
        }
        else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("\n\nLevemente acima do peso");
        }
        else if (imc >= 30.0 && imc <=34.9) {
            System.out.println("\n\nObesidade Grau I");
        }
        else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("\n\nObesidade Grau II (Severa)");
        }
        else {
            System.err.println("\n\nObesidade III (Morbida)");
        }

        System.out.printf("IMC = %.2f", imc);
        System.out.println("\n\n");

        scanner.close();
    }
}
