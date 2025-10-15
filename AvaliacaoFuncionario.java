public class AvaliacaoFuncionario {

    public static String avaliarFuncionario(double assiduidade, double produtividade, double comportamento) {
        if (assiduidade < 0 || assiduidade > 10 ||
            produtividade < 0 || produtividade > 10 ||
            comportamento < 0 || comportamento > 10) {
            return "Erro: Todas as notas devem estar no intervalo de 0 a 10.";
        }

        double media = (assiduidade + produtividade + comportamento) / 3.0;

        if (media >= 8.0 && assiduidade >= 6.0 && produtividade >= 6.0 && comportamento >= 6.0) {
            return "Promoção imediata";
        } else if (media >= 6.0 && media < 8.0) {
            return "Manter funcionário no cargo";
        } else {
            return "Plano de melhoria obrigatória";
        }
    }

    public static void main(String[] args) {
        System.out.println("Sistema de Avaliação de Funcionários");

        System.out.println("Notas (9.0, 8.5, 9.5) -> " + avaliarFuncionario(9.0, 8.5, 9.5));
        System.out.println("Notas (8.0, 8.0, 8.0) -> " + avaliarFuncionario(8.0, 8.0, 8.0));
        System.out.println("Notas (10.0, 9.0, 5.0) -> " + avaliarFuncionario(10.0, 9.0, 5.0));
        System.out.println("Notas (7.0, 8.0, 7.5) -> " + avaliarFuncionario(7.0, 8.0, 7.5));
        System.out.println("Notas (6.0, 6.0, 6.0) -> " + avaliarFuncionario(6.0, 6.0, 6.0));
        System.out.println("Notas (5.0, 6.0, 4.0) -> " + avaliarFuncionario(5.0, 6.0, 4.0));
        System.out.println("Notas (8.0, 11.0, 9.0) -> " + avaliarFuncionario(8.0, 11.0, 9.0));
    }
}