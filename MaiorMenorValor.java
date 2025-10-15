import java.util.Scanner;

public class MaiorMenorValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int menor = 0;
        int numero;

        System.out.println("Digite 10 números inteiros.");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "º número: ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                System.out.print((i + 1) + "º número: ");
                scanner.next();
            }
            numero = scanner.nextInt();

            if (i == 0) {
                maior = numero;
                menor = numero;
            } else {
                if (numero > maior) {
                    maior = numero;
                }
                
                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        System.out.println("\nResultado");
        System.out.println("O maior valor digitado foi: " + maior);
        System.out.println("O menor valor digitado foi: " + menor);

        scanner.close();
    }
}