import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimuladorVotacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> votos = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            votos.put(i, 0);
        }

        int totalVotos = 0;

        System.out.println("Votação para Melhor Jogador");
        System.out.println("Digite o código do jogador (1 a 5) para votar.");
        System.out.println("Para encerrar a votação, digite 0.");

        while (true) {
            System.out.print("Seu voto: ");
            try {
                int voto = scanner.nextInt();

                if (voto == 0) {
                    break;
                }

                if (votos.containsKey(voto)) {
                    votos.put(voto, votos.get(voto) + 1);
                    totalVotos++;
                    System.out.println("Voto para o jogador " + voto + " computado!");
                } else {
                    System.out.println("Código inválido. Por favor, vote em um jogador de 1 a 5.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); 
            }
        }

        System.out.println("\nResultado da Votação");

        if (totalVotos == 0) {
            System.out.println("Nenhum voto foi registrado.");
        } else {
            System.out.println("Total de votos: " + totalVotos + "\n");

            int vencedor = 0;
            int maxVotos = -1;

            for (Map.Entry<Integer, Integer> entry : votos.entrySet()) {
                int jogador = entry.getKey();
                int quantidade = entry.getValue();

                if (quantidade > 0) {
                    double porcentagem = ((double) quantidade / totalVotos) * 100;
                    System.out.printf("Jogador %d: %d votos (%.2f%%)\n", jogador, quantidade, porcentagem);
                }

                if (quantidade > maxVotos) {
                    maxVotos = quantidade;
                    vencedor = jogador;
                }
            }

            System.out.printf("O vencedor foi o Jogador %d com %d votos!\n", vencedor, maxVotos);
        }

        scanner.close();
    }
}