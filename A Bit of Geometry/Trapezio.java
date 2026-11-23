import java.util.Scanner;

public class Trapezio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base maior: ");
        double baseMaior = scanner.nextDouble();

        System.out.print("Informe a base menor: ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Informe a altura (h): ");
        double altura = scanner.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("A área do trapézio é: " + area);

        scanner.close();
    }
}