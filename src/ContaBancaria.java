public abstract class ContaBancaria implements Conta {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O valor do saldo é: " + saldo + " reais");
    }

    @Override
    public void depositar(double valor) throws IllegalArgumentException{
        if (valor > 0) {
            saldo += valor;
        } else {
            throw new IllegalArgumentException("O valor para deposito não pode ser negativo ou zero");
        }

    };

    public void sacar(double valor) throws IllegalArgumentException {
        if (isSaldoPositivo(valor)) {
            saldo -= valor;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente para saque");
        }

    }

    private boolean isSaldoPositivo(double valor) {
        return (saldo - valor) > 0;
    }
}
