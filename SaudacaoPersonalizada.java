import java.util.Scanner;

public class SaudacaoPersonalizada {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Por favor, digite seu nome: ");
        
        String nome = leitor.nextLine();


        System.out.print("Agora, digite sua idade: ");

        int idade = leitor.nextInt();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        leitor.close();
    }
}