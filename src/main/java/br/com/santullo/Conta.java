package br.com.santullo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public abstract class Conta implements IConta {

    protected static int AGENCIA_PADRAO = 1;

    private Integer agencia;
    private String numero;
    private BigDecimal saldo;

    @Override
    public void sacar(BigDecimal valor) {
        if (!(saldo.compareTo(BigDecimal.ZERO) <= 0)) {
            saldo = saldo.subtract(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }

        if (saldo.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Agencia " + agencia + " Conta " + numero + " Você entrou no cheque especial. R$ " + saldo);
        }
    }

    @Override
    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

    @Override
    public void transferir(Conta destino, BigDecimal valor) {
        if (!(saldo.compareTo(BigDecimal.ZERO) <= 0)) {
            if (saldo.compareTo(valor) >= 0) {
                this.sacar(valor);
                destino.depositar(valor);
                System.out.println("Enviando o valor de R$ " + valor + " para a conta " + destino.toString());
            }
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    protected void imprimirInfo() {
        System.out.printf("Agencia: %d%n", agencia);
        System.out.printf("Número: %s%n", numero);
        System.out.printf("Saldo: R$%.2f%n", saldo.doubleValue());
    }

}
