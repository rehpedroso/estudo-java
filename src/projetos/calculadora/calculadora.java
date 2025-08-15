/*
    Escreva um código para criação de uma calculadora para resolver operações básicas ( soma, subtração, divisão e multiplicação) se atentando com os seguintes requisitos:

  1. A calculadora deve ter um menu onde o usuário informa o que deseja fazer (pelo número da opção) e após realizar a operação retornar ao menu enquanto ele não selecionar a opção de sair, as opções disponíveis devem ser as seguintes:
     1. Realizar uma soma;
     2. Realizar uma subtração;
     3. Realizar uma multiplicação;
     4. Realizar uma divisão (utilizar variavel com pontos flutuantes para retornar divisão e resto do calculo);
     5. Elever um número a uma potência N;
     6. Sair da calculadora.

  2. (Opcional) Para as operações de subtração e soma após o usuário informar os 2 primeiros números disponibilizar um submenu com as seguintes opções:
     1. Informar mais números para continuar a soma/subtração:
        Quando o usuário selecionar essa opção o código deve solicitar um novo número que sera usado para somar/subtrair com o resultado da operação selecionada ( ele poderá entrar nesse menu quantas vezes desejar utilizando o resultado);
     2. Sair da operação: Encerrar a operação e voltar para o menu principal da calculadora;
*/

package projetos.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("\n========== Escolha uma das seguintes opcoes: ==========\n\n1. Realizar uma soma\n2. Realizar uma subtracao\n3. Realizar uma multiplicacao\n4. Realizar uma divisao\n5. Elevar um numero a uma potencia\n6. Sair da calculadora\n\n");
        System.out.print("Digite a opcao deseja: ");
        var opcao = scanner.nextInt();

        switch (opcao) {
            case 1: //Soma
                System.out.println("\nDigite o numero desejado: ");
                var numero1 = scanner.nextInt();
                System.out.println("\nDigite o proximo numero desejado: ");
                var numero2 = scanner.nextInt();

                var soma = numero1 + numero2;

                System.out.printf("\nA Soma entre %s + %s = %s\n\n", numero1, numero2, soma);
                
                var opcao_continuar = "";

                do {
                    System.out.println("Deseja adicionar mais um numero na soma? (s/n): ");
                    opcao_continuar = scanner.next();

                    if (opcao_continuar.equalsIgnoreCase("s")) {
                        System.out.println("\nDigite o numero desejado: ");
                        var mais_numero = scanner.nextInt();

                        var numero_armazenado_soma = soma;
                        soma += mais_numero; // acumula diretamente na soma

                        System.out.printf("\nA Soma entre %s + %s = %s\n\n", numero_armazenado_soma, mais_numero, soma);
                    }                    
                } while (opcao_continuar.equalsIgnoreCase("s"));

                break;

            case 2: //Subtracao
                System.out.println("\nDigite o numero desejado: ");
                var numero3 = scanner.nextInt();
                System.out.println("\nDigite o proximo numero desejado: ");
                var numero4 = scanner.nextInt();
                
                var subtracao = numero3 - numero4;

                System.out.printf("\nA Subtracao entre %s - %s = %s\n\n", numero3, numero4, subtracao);

                opcao_continuar = "";

                do {
                    System.out.println("Deseja adicionar mais um numero na subtracao? (s/n): ");
                    opcao_continuar = scanner.next();

                    if (opcao_continuar.equalsIgnoreCase("s")) {
                        System.out.println("\nDigite o numero desejado: ");
                        var mais_numero = scanner.nextInt();

                        var numero_armazenado_soma = subtracao;
                        subtracao -= mais_numero; // acumula diretamente na soma

                        System.out.printf("\nA Subtracao entre %s - %s = %s\n\n", numero_armazenado_soma, mais_numero, subtracao);
                    }                    
                } while (opcao_continuar.equalsIgnoreCase("s"));

                break;

            case 3: //Multiplicacao
                System.out.println("\nDigite o numero desejado: ");
                var numero5 = scanner.nextInt();
                System.out.println("\nDigite o proximo numero desejado: ");
                var numero6 = scanner.nextInt();

                var multiplicacao = numero5 * numero6;

                System.out.printf("\nA Multiplicacao entre %s * %s = %s\n\n", numero5, numero6, multiplicacao);
                break;

            case 4: //Divisao
                System.out.println("\nDigite o numero desejado: ");
                var numero7 = scanner.nextFloat();
                System.out.println("\nDigite o proximo numero desejado: ");
                var numero8 = scanner.nextFloat();

                var divisao = numero7 / numero8;

                var resto = numero7 % numero8;

                System.out.printf("\nA divisao entre %s / %s = %s\n", numero7, numero8, divisao);
                System.out.printf("O resto da divisao é %s\n\n", resto);
                break;

            case 5: //Potencia
                System.out.println("\nDigite o numero desejado: ");
                var numero9 = scanner.nextInt();
                System.out.println("\nDigite o proximo numero desejado: ");
                var numero10 = scanner.nextInt();

                var potencia = Math.pow(numero9, numero10);

                System.out.printf("\nO resultado da soma é %s\n\n", potencia);
                break;

            case 6: //Sair
                System.out.println("\nCalculadora encerrada!\nReinicie novamente!\n\n");
                break;
        
            default:
                System.out.println("Opcao invalida!");
                break;
        }

        scanner.close();
    }
}


