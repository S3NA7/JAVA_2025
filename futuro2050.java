public class futuro2050 {

    public static void main(String[] args) {
        
        int anoNascimento = 2004;
        int anoAlvo = 2050;
        int anoAtual = 2025;
        int idadeEm2050 = anoAlvo - anoNascimento;
        int anosFaltantes = anoAlvo - anoAtual;
        System.out.println("Ano de meu nascimento: " + anoNascimento);
        System.out.println("Em 2050, EU terei " + idadeEm2050 + " anos.");
        System.out.println("A partir de hoje (" + anoAtual + "), faltam " + anosFaltantes + " anos para 2050.");
    }
}