package com.github.JBreno.servico;

import com.github.JBreno.financeira.PessoaBonificavel;

public class ServicoPagamentoBonus {

    public void pagar(PessoaBonificavel pessoa, double percentualAlcancada) {
        double valorBonus = pessoa.calcularBonus(percentualAlcancada);

        System.out.printf("DEBUG: Bônus pago no valor de %.2f", valorBonus);
    }
}
