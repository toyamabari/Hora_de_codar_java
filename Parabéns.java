// 10 - Parabéns
//Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Informe a " + i + "ª nota: ");
            soma += scanner.nextDouble();
        }

        double media = soma / 4.0;
        System.out.println("Média do semestre: " + media);

        if (media >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        }

        scanner.close();
    }
}