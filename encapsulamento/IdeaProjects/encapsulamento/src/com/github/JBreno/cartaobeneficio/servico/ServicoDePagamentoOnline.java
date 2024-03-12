package com.github.JBreno.cartaobeneficio.servico;

import com.github.JBreno.cartaobeneficio.Cartao;
import com.github.JBreno.cartaobeneficio.Estabelecimento;
import com.github.JBreno.cartaobeneficio.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor) {

        cartao.debitar(valor);

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }

}
