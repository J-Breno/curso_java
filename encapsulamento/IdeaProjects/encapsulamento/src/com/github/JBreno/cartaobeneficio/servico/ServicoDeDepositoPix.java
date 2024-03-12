package com.github.JBreno.cartaobeneficio.servico;

import com.github.JBreno.cartaobeneficio.Cartao;
import com.github.JBreno.cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {

       cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);
    }

}
