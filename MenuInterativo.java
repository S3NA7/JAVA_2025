import java.util.Scanner;

public class MenuInterativo {

    public static void exibirMenu() {
        System.out.println("\n--- MENU INTERATIVO ---");
        System.out.println("1 - Cadastrar item");
        System.out.println("2 - Listar itens");
        System.out.println("3 - Sair");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;

        while (true) {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\n>> Opção 'Cadastrar item' selecionada.");
                    break;

                case "2":
                    System.out.println("\n>> Opção 'Listar itens' selecionada.");
                    break;

                case "3":
                    System.out.println("\n>> Saindo do programa. Até logo!");
                    scanner.close();
                    return;

                default:
                    System.out.println("\n>> Opção inválida! Por favor, escolha uma opção de 1 a 3.");
                    break;
            }
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
        }
    }
}