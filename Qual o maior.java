//6 - Qual o maior?
//Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o 1º valor: ");
        double n1 = scanner.nextDouble();

        System.out.print("Informe o 2º valor: ");
        double n2 = scanner.nextDouble();

        System.out.print("Informe o 3º valor: ");
        double n3 = scanner.nextDouble();

        double maior = n1;

        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        System.out.println("O maior valor é: " + maior);

        scanner.close();
    }
}