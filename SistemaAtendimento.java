public class SistemaAtendimento {

    public static String definirPrioridade(String tipo, int idade) {
        String prioridadeFinal;

        switch (tipo.toLowerCase()) {
            case "eletivo":
                prioridadeFinal = "normal";
                break;
            case "urgencia":
                prioridadeFinal = "alta";
                break;
            case "emergencia":
                prioridadeFinal = "máxima";
                break;
            default:
                return "Tipo de atendimento inválido";
        }

        if (idade >= 65) {
            if (prioridadeFinal.equals("normal")) {
                prioridadeFinal = "alta";
            } else if (prioridadeFinal.equals("alta")) {
                prioridadeFinal = "máxima";
            }
        }

        return prioridadeFinal;
    }

    public static void main(String[] args) {
        System.out.println("Sistema de Triagem de Pacientes");

        System.out.println("Paciente 1: 30 anos, eletivo. Prioridade: " + definirPrioridade("eletivo", 30));
        System.out.println("Paciente 2: 70 anos, eletivo. Prioridade: " + definirPrioridade("eletivo", 70));
        System.out.println("Paciente 3: 45 anos, urgencia. Prioridade: " + definirPrioridade("urgencia", 45));
        System.out.println("Paciente 4: 80 anos, urgencia. Prioridade: " + definirPrioridade("URGENCIA", 80));
        System.out.println("Paciente 5: 50 anos, emergencia. Prioridade: " + definirPrioridade("emergencia", 50));
        System.out.println("Paciente 6: 90 anos, emergencia. Prioridade: " + definirPrioridade("emergencia", 90));
        System.out.println("Paciente 7: 40 anos, consulta. Prioridade: " + definirPrioridade("consulta", 40));
    }
}