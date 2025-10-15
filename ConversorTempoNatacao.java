import java.util.Scanner;
public class ConversorTempoNatacao {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        final int SEGUNDOS_POR_MINUTO = 60;

        System.out.println("Conversor de Tempo para Natação");
        System.out.print("Digite o tempo total do atleta em segundos: ");
        int totalSegundos = leitor.nextInt();
        int minutos = totalSegundos / SEGUNDOS_POR_MINUTO;
        int segundosRestantes = totalSegundos % SEGUNDOS_POR_MINUTO;
        System.out.println("O tempo de " + totalSegundos + " segundos equivale a:");
        System.out.println(minutos + " minuto(s) e " + segundosRestantes + " segundo(s).");

        leitor.close();
    }
}