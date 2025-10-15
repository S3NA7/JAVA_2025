public class CalculoSalario {
    public static void main(String[] args) {
        
        double salarioBruto = 4750.50;
        double percentualImposto = 15.0;
        double valorImposto = salarioBruto * (percentualImposto / 100.0);
        double salarioLiquido = salarioBruto - valorImposto;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Percentual do Imposto: " + percentualImposto + "%");
        System.out.printf("Imposto a ser pago: R$ %.2f\n", valorImposto);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);
    }
}
