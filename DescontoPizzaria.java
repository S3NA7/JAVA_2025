import java.util.Scanner;

public class DescontoPizzaria {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        final double VALOR_MINIMO_DESCONTO = 50.00;
        final double PERCENTUAL_DESCONTO = 0.10; 

        System.out.println(" Pizzaria do Arthur");
        System.out.println("Promoção: 10% de desconto em compras acima de R$ 50.00!");
        System.out.print("\nDigite o valor total da sua compra: R$ ");
        double valorCompra = leitor.nextDouble();

        double valorFinal;

        if (valorCompra > VALOR_MINIMO_DESCONTO) {
            double valorDoDesconto = valorCompra * PERCENTUAL_DESCONTO;
            valorFinal = valorCompra - valorDoDesconto;
            
            System.out.println("\nParabéns! Você ganhou um desconto de 10%.");
            System.out.printf("Valor do desconto: R$ %.2f\n", valorDoDesconto);

        } else {
            valorFinal = valorCompra;
            System.out.println("\nO valor da sua compra não atingiu o mínimo para o desconto.");
        }
        System.out.printf("Valor final a pagar: R$ %.2f\n", valorFinal);

        leitor.close();
    }
}