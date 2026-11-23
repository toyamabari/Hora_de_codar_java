// 18. A pagar
//Desenvolva um programa para uma revendedora de carros usados que calcula o salário final de seus funcionários vendedores. O algoritmo deve receber como entrada o número de carros vendidos, o valor total das vendas, o salário fixo mensal do vendedor e a comissão fixa por carro vendido.
//O salário final do vendedor é calculado somando o salário fixo mensal, a comissão fixa por carro vendido e 5% do valor total das vendas realizadas pelo vendedor.
//Considere que o salário inicial é de R$ 5.000,00.
//O Programa deve exibir e detalhar cada venda, a comissão e o percentual e exibir o valor final.

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        double[] vendas = new double[carrosVendidos];
        double totalVendas = 0;

        for (int i = 0; i < carrosVendidos; i++) {
            System.out.print("Informe o valor da " + (i + 1) + "ª venda: ");
            vendas[i] = scanner.nextDouble();
            totalVendas += vendas[i];
        }

        System.out.print("Informe o salário fixo mensal (ex: 5000): ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Informe a comissão fixa por carro vendido: ");
        double comissaoPorCarro = scanner.nextDouble();

        double totalComissaoFixa = carrosVendidos * comissaoPorCarro;
        double percentualVendas = totalVendas * 0.05;
        double salarioFinal = salarioFixo + totalComissaoFixa + percentualVendas;

        System.out.println("\n--- Detalhamento ---");
        for (int i = 0; i < carrosVendidos; i++) {
            System.out.printf("Venda %d: R$ %.2f%n", (i + 1), vendas[i]);
        }
        System.out.printf("Salário fixo: R$ %.2f%n", salarioFixo);
        System.out.printf("Comissão total por carros (%d x R$ %.2f): R$ %.2f%n",
                carrosVendidos, comissaoPorCarro, totalComissaoFixa);
        System.out.printf("Percentual (5%% sobre R$ %.2f): R$ %.2f%n", totalVendas, percentualVendas);
        System.out.printf("Salário final: R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}