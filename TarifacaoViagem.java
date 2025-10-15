import java.text.NumberFormat;
import java.util.Locale;

public class TarifacaoViagem {

    public static double calcularPrecoPassagem(String classe, int idade) {
        double precoBase;

        String classeNormalizada = classe.toLowerCase();
        if (classeNormalizada.equals("econômica") || classeNormalizada.equals("economica")) {
            classeNormalizada = "econômica";
        }

        switch (classeNormalizada) {
            case "econômica":
                precoBase = 500.00;
                break;
            case "executiva":
                precoBase = 1200.00;
                break;
            case "primeira classe":
                precoBase = 2500.00;
                break;
            default:
                return -1.0;
        }

        if (idade >= 60) {
            return precoBase * 0.85;
        }

        return precoBase;
    }

    public static void main(String[] args) {
        System.out.println("Sistema de Tarifação de Viagens");
        
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        
        String[] classes = {"Econômica", "Executiva", "Primeira classe", "economica", "Turista"};
        int[] idades = {35, 65};

        for (String classe : classes) {
            for (int idade : idades) {
                double precoFinal = calcularPrecoPassagem(classe, idade);

                System.out.print("Passageiro de " + idade + " anos, classe '" + classe + "': ");
                
                if (precoFinal == -1.0) {
                    System.out.println("Classe de viagem inválida.");
                } else {
                    System.out.println("Preço final: " + formatadorMoeda.format(precoFinal));
                }
            }
        }
    }
}