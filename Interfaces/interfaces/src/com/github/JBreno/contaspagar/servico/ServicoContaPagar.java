package com.github.JBreno.contaspagar.servico;

import com.github.JBreno.pagamento.DocumentoPagavel;
import com.github.JBreno.pagamento.MetodoPagamento;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }



    public void pagar(DocumentoPagavel documento) {

        metodoPagamento.pagar(documento);
    }

}
