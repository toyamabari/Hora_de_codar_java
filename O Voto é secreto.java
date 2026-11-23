// 16. O Voto é secreto
//Escreva um programa para ler:
//o número total de eleitores de um município.
//Agora o programa deve receber a quantindade (percentual):
//o número de votos brancos;
//o número de votos válidos;
//o número de votos nulos.
//Por fim, o programa vai calcular e escrever a quantidade de votos que cada categoria (brancos, nulos e válidos) representa em relação ao total
//de eleitores.

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Informe o número de votos brancos: ");
        int brancos = scanner.nextInt();

        System.out.print("Informe o número de votos válidos: ");
        int validos = scanner.nextInt();

        System.out.print("Informe o número de votos nulos: ");
        int nulos = scanner.nextInt();

        double percBrancos = (brancos * 100.0) / totalEleitores;
        double percValidos = (validos * 100.0) / totalEleitores;
        double percNulos = (nulos * 100.0) / totalEleitores;

        System.out.printf("Votos brancos: %.2f%%%n", percBrancos);
        System.out.printf("Votos válidos: %.2f%%%n", percValidos);
        System.out.printf("Votos nulos: %.2f%%%n", percNulos);

        scanner.close();
    }
}