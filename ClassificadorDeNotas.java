public class ClassificadorDeNotas {

    public static String conceitoNota(double nota) {
        if (nota < 0 || nota > 10) {
            return "Nota inválida";
        }

        if (nota >= 9.0) {
            return "A";
        } else if (nota >= 8.0) {
            return "B";
        } else if (nota >= 7.0) {
            return "C";
        } else if (nota >= 6.0) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println("Sistema de Classificação de Notas");

        double[] notasParaTestar = {10.0, 9.0, 8.9, 8.0, 7.5, 6.9, 6.0, 5.9, 0.0, 11.0, -2.0};

        for (double nota : notasParaTestar) {
            String conceito = conceitoNota(nota);
            System.out.println("Nota: " + nota + " -> Conceito: " + conceito);
        }
    }
}