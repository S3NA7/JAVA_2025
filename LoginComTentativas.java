import java.util.Scanner;

public class LoginComTentativas {

    public static void main(String[] args) {

        final String SENHA_CORRETA = "java123";
        final int MAX_TENTATIVAS = 3;

        Scanner scanner = new Scanner(System.in);
        boolean acessoPermitido = false;

        System.out.println("Sistema de Login");
        System.out.println("Você tem " + MAX_TENTATIVAS + " tentativas para acertar a senha.");

        for (int tentativa = 1; tentativa <= MAX_TENTATIVAS; tentativa++) {
            System.out.print("Tentativa " + tentativa + ": Digite a senha: ");
            String senhaDigitada = scanner.nextLine();

            if (senhaDigitada.equals(SENHA_CORRETA)) {
                acessoPermitido = true;
                break;
            } else {
                System.out.println("❌ Senha incorreta.");
            }
        }

        if (acessoPermitido) {
            System.out.println("\n✅ Acesso permitido! Bem-vindo(a).");
        } else {
            System.out.println("\n🚫 Você excedeu o número máximo de tentativas. Acesso bloqueado.");
        }

        scanner.close();
    }
}