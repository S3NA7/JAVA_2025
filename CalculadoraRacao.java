import java.util.Scanner;

public class CalculadoraRacao {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Calculadora de Ração para Frangos (Período de 7 dias)");
        System.out.print("Digite o número total de frangos na sua criação: ");
        int numeroFrangos = leitor.nextInt();
        System.out.print("Digite a quantidade de ração que um frango consome por dia (em gramas): ");
        double consumoPorFrangoGramas = leitor.nextDouble();
        int dias = 7;
        double consumoDiarioTotalGramas = numeroFrangos * consumoPorFrangoGramas;
        double consumoSemanalGramas = consumoDiarioTotalGramas * dias;
        double consumoSemanalKg = consumoSemanalGramas / 1000.0;
        System.out.println("\n--- Resumo do Planejamento de Ração ---");
        System.out.println("Número de frangos: " + numeroFrangos);
        System.out.println("Consumo diário por frango: " + consumoPorFrangoGramas + " g");
        System.out.println("Ração total necessária por dia: " + consumoDiarioTotalGramas + " g (" + (consumoDiarioTotalGramas / 1000.0) + " kg)");
        System.out.println("Ração total necessária para " + dias + " dias: " + consumoSemanalGramas + " g");
        System.out.printf("Isso equivale a %.2f kg de ração para a semana.\n", consumoSemanalKg);

        leitor.close();
    }
}