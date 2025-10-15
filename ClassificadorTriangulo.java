import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassificadorTriangulo {

    public static String classificar(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            return "Os lados informados não formam um triângulo válido.";
        }

        if (a == b && b == c) {
            return "O triângulo é Equilátero.";
        } else if (a == b || a == c || b == c) {
            return "O triângulo é Isósceles.";
        } else {
            return "O triângulo é Escaleno.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Classificador de Triângulos");
        System.out.println("Por favor, informe os comprimentos dos três lados.");

        try {
            System.out.print("Lado 1: ");
            double ladoA = scanner.nextDouble();

            System.out.print("Lado 2: ");
            double ladoB = scanner.nextDouble();

            System.out.print("Lado 3: ");
            double ladoC = scanner.nextDouble();

            String resultado = classificar(ladoA, ladoB, ladoC);

            System.out.println("\nResultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("\nErro: Por favor, insira apenas valores numéricos.");
        }

        scanner.close();
    }
}