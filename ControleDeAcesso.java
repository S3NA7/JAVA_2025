public class ControleDeAcesso {

    public static String verificarAcesso(String login, String senha, String nivel) {
        if (login.equalsIgnoreCase("root") && senha.equals("toor")) {
            return "Acesso total (Superusuário)";
        }

        switch (nivel.toLowerCase()) {
            case "admin":
                return "Acesso total";
            case "user":
                return "Acesso limitado";
            case "guest":
                return "Acesso somente leitura";
            default:
                return "Nível de acesso desconhecido. Acesso negado.";
        }
    }

    public static void main(String[] args) {
        System.out.println("Sistema de Controle de Acesso");

        System.out.println("Tentativa: login='root', senha='toor', nivel='guest'");
        System.out.println("Resultado: " + verificarAcesso("root", "toor", "guest"));;
        System.out.println("Tentativa: login='root', senha='wrong', nivel='admin'");
        System.out.println("Resultado: " + verificarAcesso("root", "wrong", "admin"));
        System.out.println("Tentativa: login='maria', senha='123', nivel='ADMIN'");
        System.out.println("Resultado: " + verificarAcesso("maria", "123", "ADMIN")); 
        System.out.println("Tentativa: login='joao', senha='abc', nivel='user'");
        System.out.println("Resultado: " + verificarAcesso("joao", "abc", "user"));
        System.out.println("Tentativa: login='visitante', senha='', nivel='guest'");
        System.out.println("Resultado: " + verificarAcesso("visitante", "", "guest"));
        System.out.println("Tentativa: login='ana', senha='456', nivel='moderador'");
        System.out.println("Resultado: " + verificarAcesso("ana", "456", "moderador"));
    }
}