import java.text.NumberFormat;
import java.util.Locale;

public class CaixaEletronico1 {

    public static String operacaoCaixa(String operacao, double saldo, double valor) {
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        switch (operacao.toLowerCase()) {
            case "saldo":
                return "Saldo atual: " + formatadorMoeda.format(saldo);

            case "deposito":
                if (valor <= 0) {
                    return "Erro: O valor do depósito deve ser positivo.";
                }
                double novoSaldoDeposito = saldo + valor;
                return "Depósito realizado. Novo saldo: " + formatadorMoeda.format(novoSaldoDeposito);

            case "saque":
                if (valor <= 0) {
                    return "Erro: O valor do saque deve ser positivo.";
                }
                if (valor > saldo) {
                    return "Erro: Saldo insuficiente. Saldo disponível: " + formatadorMoeda.format(saldo);
                }
                double novoSaldoSaque = saldo - valor;
                return "Saque realizado. Novo saldo: " + formatadorMoeda.format(novoSaldoSaque);

            default:
                return "Erro: Operação inválida. Use 'saldo', 'deposito' ou 'saque'.";
        }
    }

    public static void main(String[] args) {
        double saldoInicial = 1250.75;

        System.out.println("Simulador de Caixa Eletrônico");
        System.out.println("Saldo inicial da conta: " + NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(saldoInicial));

        System.out.println("Operação: saldo");
        System.out.println("Resultado: " + operacaoCaixa("saldo", saldoInicial, 0));
        System.out.println();

        System.out.println("Operação: deposito de R$ 300,25");
        String resultadoDeposito = operacaoCaixa("deposito", saldoInicial, 300.25);
        System.out.println("Resultado: " + resultadoDeposito);
        System.out.println();
        
        System.out.println("Operação: saque de R$ 150,00");
        String resultadoSaqueValido = operacaoCaixa("SAQUE", saldoInicial, 150.00);
        System.out.println("Resultado: " + resultadoSaqueValido);
        System.out.println();

        System.out.println("Operação: saque de R$ 2000,00");
        String resultadoSaqueInvalido = operacaoCaixa("saque", saldoInicial, 2000.00);
        System.out.println("Resultado: " + resultadoSaqueInvalido);
        System.out.println();
        
        System.out.println("Operação: transferir R$ 100,00");
        String resultadoOperacaoInvalida = operacaoCaixa("transferir", saldoInicial, 100.00);
        System.out.println("Resultado: " + resultadoOperacaoInvalida);
    }
}