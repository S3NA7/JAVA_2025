import java.util.Scanner;
public class ConversorSegundosCompleto {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        final int SEGUNDOS_EM_UM_MINUTO = 60;
        final int SEGUNDOS_EM_UMA_HORA = 3600;

        System.out.println("Conversor de Segundos para Horas, Minutos e Segundos");
        System.out.print("\nDigite a quantidade total de segundos: ");
        int totalSegundos = leitor.nextInt();
        int horas = totalSegundos / SEGUNDOS_EM_UMA_HORA;
        int segundosRestantes = totalSegundos % SEGUNDOS_EM_UMA_HORA;
        int minutos = segundosRestantes / SEGUNDOS_EM_UM_MINUTO;
        int segundosFinais = segundosRestantes % SEGUNDOS_EM_UM_MINUTO;
        System.out.println(totalSegundos + " segundos correspondem a:");
        System.out.println(horas + " hora(s), " + minutos + " minuto(s) e " + segundosFinais + " segundo(s).");

        leitor.close();
    }
}