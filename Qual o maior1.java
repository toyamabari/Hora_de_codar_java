//6.1 - Qual o maior? (4 vezes pior)
//Faça um programa para ler 4 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class Exercicio6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maior = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Informe o " + i + "º valor: ");
            double valor = scanner.nextDouble();

            if (i == 1 || valor > maior) {
                maior = valor;
            }
        }

        System.out.println("O maior valor é: " + maior);

        scanner.close();
    }
}