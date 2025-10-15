import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CalculoFrete {

    public static void main(String[] args) {
        // 1. Leia a String "45.75".
        String valorFreteString = "45.75";
        System.out.println("Valor do frete recebido (String): " + valorFreteString);

        // 2. Converta para double.
        // O método Double.parseDouble() converte a String em um double.
        double valorFreteDouble = Double.parseDouble(valorFreteString);
        
        // 3. Calcule o valor com acréscimo de 10%.
        // Multiplicar por 1.1 é o mesmo que somar 10%.
        double valorFinal = valorFreteDouble * 1.10;

        // 4. Exiba o resultado formatado como moeda.
        // System.out.printf é ótimo para formatar a saída.
        // "%.2f" significa formatar o número flutuante (f) com 2 casas decimais.
        System.out.printf("Valor final com acréscimo de 10%%: R$ %.2f%n", valorFinal);
    }
}