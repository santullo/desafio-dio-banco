package br.com.santullo;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaAuxiliar = new ContaCorrente();
        contaAuxiliar.setSaldo(BigDecimal.ZERO);

        ContaCorrente conta = new ContaCorrente();
        conta.setSaldo(BigDecimal.valueOf(10000));
        conta.sacar(BigDecimal.valueOf(9999));
        conta.depositar(BigDecimal.valueOf(9));
        conta.transferir(contaAuxiliar, BigDecimal.valueOf(9));
        conta.imprimirExtrato();

        System.out.println();

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(BigDecimal.valueOf(1000));
        contaPoupanca.sacar(BigDecimal.valueOf(999));
        contaPoupanca.depositar(BigDecimal.valueOf(9999));
        contaPoupanca.transferir(conta, BigDecimal.valueOf(999));
        contaPoupanca.imprimirExtrato();

        System.out.println();

        ContaCorrente conta1 = new ContaCorrente();
        conta1.setSaldo(BigDecimal.valueOf(100));
        conta1.sacar(BigDecimal.valueOf(999));
        conta1.depositar(BigDecimal.valueOf(9999));
        conta1.transferir(contaPoupanca, BigDecimal.valueOf(9000));
        conta1.imprimirExtrato();

        System.out.println();

        ContaPoupanca contaPoupanca1 = new ContaPoupanca();
        contaPoupanca1.setSaldo(BigDecimal.valueOf(10));
        contaPoupanca1.sacar(BigDecimal.valueOf(9));
        contaPoupanca1.depositar(BigDecimal.valueOf(345));
        contaPoupanca1.transferir(conta1, BigDecimal.valueOf(345));
        contaPoupanca1.imprimirExtrato();

    }
}