// 15 - Uma Brincadeira Sobre Alturas
//Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O metro e cresce 3 centímetros por ano.
//Construa um programa que calcule e imprima quantos anos serão necessários para que Felisberto seja maior que Anacleto.

public class Exercicio15 {
    public static void main(String[] args) {
        // Trabalhando em centímetros para evitar imprecisão de ponto flutuante
        int anacletoCm = 150; // 1,50 m
        int felisbertoCm = 110; // 1,10 m
        int anos = 0;

        while (felisbertoCm <= anacletoCm) {
            anacletoCm += 2;
            felisbertoCm += 3;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para Felisberto ser maior que Anacleto.");
    }
}