// 17. Custa quanto?
//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
//Supondo que o percentual do distribuidor seja de 28% e os impostos de 45% sobre o valor da fábrica, escreva um programa para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double custoFinal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);
        System.out.printf("Custo final ao consumidor: R$ %.2f%n", custoFinal);

        scanner.close();
    }
}