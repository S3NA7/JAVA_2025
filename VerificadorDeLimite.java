import java.util.Scanner;
import java.math.BigInteger;

public class VerificadorDeLimite {

    public static void main(String[] args) {
        System.out.println("O limite para uma variável 'int' em Java é:");
        System.out.println("Valor Máximo (Integer.MAX_VALUE): " + Integer.MAX_VALUE);
        System.out.println("Valor Mínimo (Integer.MIN_VALUE): " + Integer.MIN_VALUE);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para verificar se está dentro do limite: ");
        String entrada = scanner.next();

        try {
            BigInteger numeroUsuario = new BigInteger(entrada);
            BigInteger maxInt = BigInteger.valueOf(Integer.MAX_VALUE);
            BigInteger minInt = BigInteger.valueOf(Integer.MIN_VALUE);
            if (numeroUsuario.compareTo(maxInt) <= 0 && numeroUsuario.compareTo(minInt) >= 0) {
                System.out.println("\nO número " + numeroUsuario + " ESTÁ DENTRO do intervalo suportado por 'int'.");
            } else {
                System.out.println("\nO número " + numeroUsuario + " ESTÁ FORA do intervalo suportado por 'int'.");
            }

        } catch (NumberFormatException e) {
            System.out.println("\nErro: A entrada fornecida não é um número inteiro válido.");
        } finally {
            scanner.close();
        }
    }
}