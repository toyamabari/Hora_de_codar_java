// 21. Descanso merecido
// Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar em condições, um dos seguintes requisitos deve ser satisfeito:
// - Ter no mínimo 65 anos de idade.
// - Ter trabalhado no mínimo 30 anos.
// - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
//Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código do empregado: ");
        int codigo = scanner.nextInt();

        System.out.print("Informe o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Informe o ano de ingresso na empresa: ");
        int anoIngresso = scanner.nextInt();

        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;

        System.out.println("Empregado código: " + codigo);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

        boolean qualificado = (idade >= 65)
                || (tempoTrabalho >= 30)
                || (idade >= 60 && tempoTrabalho >= 25);

        if (qualificado) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }

        scanner.close();
    }
}