import java.util.Scanner;
public class CalculadoraParcelas {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        final int NUMERO_PARCELAS = 3;

        System.out.println("Loja de Eletrônicos");
        System.out.println("Cálculo de parcelamento em " + NUMERO_PARCELAS + "x sem juros.");
        System.out.print("\nDigite o preço total do smartphone: R$ ");
        double precoTotal = leitor.nextDouble();
        double valorParcela = precoTotal / NUMERO_PARCELAS;
        System.out.printf("Preço total: R$ %.2f\n", precoTotal);
        System.out.printf("O valor de cada uma das %d parcelas será de: R$ %.2f\n", NUMERO_PARCELAS, valorParcela);

        leitor.close();
    }
}