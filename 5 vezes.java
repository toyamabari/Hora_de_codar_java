// 7.1 - 5 vezes?
//Faça um programa que leia 5  valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

import java.util.Scanner;

public class Exercicio7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maior1 = Double.NEGATIVE_INFINITY;
        double maior2 = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Informe o " + i + "º valor: ");
            double valor = scanner.nextDouble();

            if (valor > maior1) {
                maior2 = maior1;
                maior1 = valor;
            } else if (valor > maior2) {
                maior2 = valor;
            }
        }

        double soma = maior1 + maior2;
        System.out.println("A soma dos 2 maiores valores é: " + soma);

        scanner.close();
    }
}