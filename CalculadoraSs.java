import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraSs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("---");

            switch (operacao) {
                case '+':
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Resultado: " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    } else {
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Erro: Operação inválida. Use apenas +, -, * ou /.");
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, certifique-se de digitar números.");
        } finally {
            scanner.close();
        }
    }
}