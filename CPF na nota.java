// 20. CPF na nota?
//Faça um programa para ler:
//O nome do produto,
//A quantidade adquirida do produto,
//O preço unitário do produto.
//Agora o programa deve calcular e escrever:
//O valor da venda (valor da venda = quantidade adquirida * preço unitário),
//O percentual de desconto,
//O valor fixo de imposto que é 20%.
//O total a pagar (total a pagar = valor da venda - desconto).
//Sabendo-se que:
//Se quantidade <= 5 o desconto será de 2%
// -
//Se quantidade > 5 e quantidade <=10 o desconto será de 3%
// -
//Se quantidade > 10 o desconto será de 5%
//No fim, escreva um recibo que detalhe a compra como uma nota fiscal.

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String produto = scanner.nextLine();

        System.out.print("Informe a quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Informe o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        double valorVenda = quantidade * precoUnitario;

        int percentualDesconto;
        if (quantidade <= 5) {
            percentualDesconto = 2;
        } else if (quantidade <= 10) {
            percentualDesconto = 3;
        } else {
            percentualDesconto = 5;
        }

        double valorDesconto = valorVenda * (percentualDesconto / 100.0);
        double valorImposto = valorVenda * 0.20; // Imposto fixo de 20%
        double totalPagar = valorVenda - valorDesconto;

        System.out.println("\n========== NOTA FISCAL / RECIBO ==========");
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
        System.out.printf("Valor da venda: R$ %.2f%n", valorVenda);
        System.out.printf("Percentual de desconto: %d%% (R$ %.2f)%n", percentualDesconto, valorDesconto);
        System.out.printf("Valor fixo de imposto (20%%): R$ %.2f%n", valorImposto);
        System.out.printf("Total a pagar: R$ %.2f%n", totalPagar);
        System.out.println("==========================================");

        scanner.close();
    }
}