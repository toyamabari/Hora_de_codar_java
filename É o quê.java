// 19. É o quê?
//Crie um programa para ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo.
//Obs: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Informe o lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Informe o lado C: ");
        double c = scanner.nextDouble();

        if (a > 0 && b > 0 && c > 0 && (a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }

        scanner.close();
    }
}