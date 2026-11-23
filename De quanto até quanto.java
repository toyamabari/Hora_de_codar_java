// 13 - De quanto até quanto?
//Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número inteiro: ");
        int inicio = scanner.nextInt();

        System.out.print("Informe o segundo número inteiro (maior que o primeiro): ");
        int fim = scanner.nextInt();

        int soma = 0;
        int quantidade = 0;

        for (int i = inicio; i <= fim; i++) {
            soma += i;
            quantidade++;
        }

        double media = (double) soma / quantidade;
        System.out.println("Média aritmética de " + inicio + " até " + fim + ": " + media);

        scanner.close();
    }
}