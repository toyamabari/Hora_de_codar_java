// 9 -  Cansar de Digitar
//Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[10];
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextDouble();
            soma += valores[i];
        }

        System.out.print("Números informados: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + (i < valores.length - 1 ? ", " : ""));
        }

        double media = soma / 10.0;
        System.out.println("\nMédia aritmética: " + media);

        scanner.close();
    }
}