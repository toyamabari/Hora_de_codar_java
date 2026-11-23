// 8 - Enquanto isso
//Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser lido um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo. O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o 1º valor: ");
        double valor1 = scanner.nextDouble();

        double valor2;
        do {
            System.out.print("Informe o 2º valor (maior que zero): ");
            valor2 = scanner.nextDouble();
            if (valor2 <= 0) {
                System.out.println("Valor inválido! O segundo valor não pode ser zero nem negativo.");
            }
        } while (valor2 <= 0);

        double resultado = valor1 / valor2;
        System.out.println("Resultado da divisão: " + resultado);

        scanner.close();
    }
}