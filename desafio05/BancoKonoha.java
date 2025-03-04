package nivelIntermediario.desafio05;

import java.util.Objects;

public class BancoKonoha {
    public static void main(String[] args) {

        ContaCorrente contaCorrente1 = new ContaCorrente(1000);

        contaCorrente1.consultarSaldo();
        contaCorrente1.depositar(10);
        contaCorrente1.consultarSaldo();

        System.out.println("-----------------------------------------------------");

        ContaPoupanca contaPoupanca1 = new ContaPoupanca(1000);

        contaPoupanca1.consultarSaldo();
        contaPoupanca1.depositar(50);
        contaPoupanca1.consultarSaldo();

        System.out.println("-------------------------------------------------------");

        BancoKonoha.traferencia(60, contaCorrente1, contaPoupanca1);


        contaCorrente1.consultarSaldo();
        contaPoupanca1.consultarSaldo();

    }

    public static void traferencia(double valor, ContaBancaria origem, ContaBancaria destino) {
        Objects.requireNonNull(origem, "A conta de origem não pode null");
        Objects.requireNonNull(destino, "A conta de destino não pode null");

        try {
            origem.sacar(valor);
            destino.depositar(valor);
        } catch (IllegalArgumentException e) {
            System.out.println("Não foi possível realizar a tranfarencia, pois o saldo é insuficiente para o saque");
        }


    }
}
