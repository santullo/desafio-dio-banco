package br.com.santullo;

import java.math.BigDecimal;

public interface IConta {

    public void sacar(BigDecimal valor);

    public void depositar(BigDecimal valor);

    public void transferir(Conta destino, BigDecimal valor);
}
