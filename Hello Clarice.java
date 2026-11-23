// 2 - Hello Clarice
// Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nomeDoUsuario = scanner.nextLine();

        System.out.println("Olá, " + nomeDoUsuario);

        scanner.close();
    }
}