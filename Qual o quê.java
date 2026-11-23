// 7 - Qual o quê?
//Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o 1º valor: ");
        double n1 = scanner.nextDouble();

        System.out.print("Informe o 2º valor: ");
        double n2 = scanner.nextDouble();

        System.out.print("Informe o 3º valor: ");
        double n3 = scanner.nextDouble();

        double menor = n1;
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }

        double somaDosMaiores = (n1 + n2 + n3) - menor;
        System.out.println("A soma dos 2 maiores valores é: " + somaDosMaiores);

        scanner.close();
    }
}