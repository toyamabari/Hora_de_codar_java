import java.util.Scanner;

public class Losango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a diagonal maior: ");
        double diagonalMaior = scanner.nextDouble();

        System.out.print("Informe a diagonal menor: ");
        double diagonalMenor = scanner.nextDouble();

        double area = (diagonalMaior * diagonalMenor) / 2;
        System.out.println("A área do losango é: " + area);

        scanner.close();
    }
}