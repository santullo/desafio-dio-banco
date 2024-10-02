package br.com.santullo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class ContaCorrente extends Conta {
    private static int SEQUENCIAL = 1;

    public ContaCorrente() {
        super.setAgencia(Conta.AGENCIA_PADRAO);
        super.setNumero(String.valueOf(SEQUENCIAL++));
    }

    @Override
    public String toString() {
        return "Conta Corrente {\"agencia\": " +
                getAgencia() +
                ", \"número\": " +
                getNumero()  +
                "}";
    }

    public void imprimirExtrato() {
        System.out.println("== Extrato da Conta Corrente ==");
        super.imprimirInfo();
    }
}
