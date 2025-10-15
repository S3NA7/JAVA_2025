import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificadorDeNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificador de Situação do Aluno");
        System.out.print("Digite a nota do aluno (0 a 10): ");

        try {
            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Erro: Nota inválida. Por favor, insira um valor entre 0 e 10.");
            } else {
                if (nota >= 7.0) {
                    System.out.println("Situação: Aprovado");
                } else if (nota >= 5.0) {
                    System.out.println("Situação: Recuperação");
                } else {
                    System.out.println("Situação: Reprovado");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um valor numérico.");
        } finally {
            scanner.close();
        }
    }
}