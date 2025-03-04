package nivelIntermediario.desafio05;

public class ContaPoupanca extends ContaBancaria{

    public static final double TAXA_PARA_DEPOSITO = 0.01;


    private TipoConta tipoConta = TipoConta.POUPACA;


    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    // teria como alterar a logica para não utilizar o "Set saldo" mas conseguir mudar o valor do saldo dentro do método
// que herda a classe mãe?

    @Override
    public void depositar(double valor) {
        super.depositar(aplicarTaxaDeDeposito(valor));
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo conta poupança R$" + getSaldo());
    }

    private static double aplicarTaxaDeDeposito(double valorComTaxa) {
        return (valorComTaxa - (valorComTaxa * TAXA_PARA_DEPOSITO));
    }


}
