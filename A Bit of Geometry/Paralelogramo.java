import java.util.Scanner;

public class Paralelogramo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base do paralelogramo: ");
        double base = scanner.nextDouble();

        System.out.print("Informe a altura do paralelogramo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        System.out.println("A área do paralelogramo é: " + area);

        scanner.close();
    }
}