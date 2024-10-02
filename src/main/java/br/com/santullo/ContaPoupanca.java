package br.com.santullo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaPoupanca() {
        super.setAgencia(Conta.AGENCIA_PADRAO);
        super.setNumero(String.valueOf(SEQUENCIAL++));
    }

    @Override
    public String toString() {
        return "Conta Poupanca {\"agencia\": " +
                getAgencia() +
                ", \"número\": " +
                getNumero() +
                "}";
    }

    public void imprimirExtrato() {
        System.out.println("== Extrato da Conta Poupança ==");
        super.imprimirInfo();
    }
}
