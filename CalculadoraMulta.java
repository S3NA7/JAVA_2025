import java.util.Scanner;
public class CalculadoraMulta {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        final double MULTA_POR_DIA = 0.50;

        System.out.println("--- Sistema de Multas da Biblioteca ---");
        System.out.print("Digite o número de dias de atraso na devolução do livro: ");
        int diasAtraso = leitor.nextInt();
        if (diasAtraso > 0) {
            double multaTotal = diasAtraso * MULTA_POR_DIA;
            System.out.println("Atraso de: " + diasAtraso + " dia(s).");
            System.out.printf("O valor total da multa é de: R$ %.2f\n", multaTotal);
        } else {

            System.out.println("Não há multa a ser paga. O livro foi devolvido no prazo!");
        }

        leitor.close();
    }
}