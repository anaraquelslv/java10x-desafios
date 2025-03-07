public class ContaCorrente extends ContaBancaria{

    TipoConta tipoConta = TipoConta.CORRENTE;

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo conta corrente R$" + getSaldo());
    }

    // Regras de négocio especificas poderiam ser implementadas aqui

}
