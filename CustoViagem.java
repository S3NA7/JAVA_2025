import java.util.Scanner;
public class CustoViagem {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Calculadora de Custo de Viagem");
        System.out.print("Digite a distância total da viagem (em km): ");
        double distanciaKm = leitor.nextDouble();

        System.out.print("Digite o consumo de combustível do veículo (em km/l): ");
        double consumoKmLitro = leitor.nextDouble();

        System.out.print("Digite o preço do litro do combustível (use ponto, ex: 5.89): R$ ");
        double precoLitro = leitor.nextDouble();
        double litrosNecessarios = distanciaKm / consumoKmLitro;
        double custoTotal = litrosNecessarios * precoLitro;
        System.out.println("\nResumo da Viagem");
        System.out.printf("Distância a percorrer: %.1f km\n", distanciaKm);
        System.out.printf("Consumo do veículo: %.1f km/l\n", consumoKmLitro);
        System.out.printf("Preço do combustível: R$ %.2f por litro\n", precoLitro);
        System.out.printf("Você precisará de aproximadamente %.2f litros de combustível.\n", litrosNecessarios);
        System.out.printf("O custo total da viagem será de: R$ %.2f\n", custoTotal);
        
        leitor.close();
    }
}