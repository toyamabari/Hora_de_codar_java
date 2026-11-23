// 3 - A Bit of Information
// Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário.
// Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nomeDoUsuario = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + nomeDoUsuario + ", sua idade é " + idade);

        scanner.close();
    }
}