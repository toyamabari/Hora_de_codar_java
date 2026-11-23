// 25. Invertendo tudo
//Escreva um programa que para ler doze números informados pelo usuário e que serão armazenados em um vetor/array.
//No fim o programa deve dar duas saídas:
//1) o programa deve processar os dados invertendo a posição dos elementos trocando o primeiro elemento com o último, o segundo com penúltimo etc.
//2) o programa deve processar os dados invertendo a posição dos elementos trocando, mas separando os dados por tipo.
//Exemplo:
//Usuário informa: A, 1, B, 2, C, 3 D, 4, E, 5, F, 6
//Saída 1:  6, F, 5, E, 4, D, 3, 2, B, 1
//Saída 2:  6, 5, 4, 3, 2, 1 - F, E, D, C, A, B

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elementos = new String[12];

        System.out.println("Informe 12 elementos (ex: A, 1, B, 2...):");
        for (int i = 0; i < 12; i++) {
            System.out.print((i + 1) + "º elemento: ");
            elementos[i] = scanner.next().trim();
        }

        // Saída 1: inverter todas as posições
        System.out.print("Saída 1: ");
        for (int i = elementos.length - 1; i >= 0; i--) {
            System.out.print(elementos[i] + (i > 0 ? ", " : ""));
        }
        System.out.println();

        // Saída 2: inverter separando números e letras/outros textos
        List<String> numeros = new ArrayList<>();
        List<String> naoNumeros = new ArrayList<>();

        for (int i = elementos.length - 1; i >= 0; i--) {
            if (elementos[i].matches("-?\\d+(\\.\\d+)?")) {
                numeros.add(elementos[i]);
            } else {
                naoNumeros.add(elementos[i]);
            }
        }

        System.out.print("Saída 2: ");
        System.out.print(String.join(", ", numeros));
        if (!numeros.isEmpty() && !naoNumeros.isEmpty()) {
            System.out.print(" - ");
        }
        System.out.println(String.join(", ", naoNumeros));

        scanner.close();
    }
}