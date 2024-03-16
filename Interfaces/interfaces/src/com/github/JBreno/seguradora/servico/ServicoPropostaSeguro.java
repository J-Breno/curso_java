package com.github.JBreno.seguradora.servico;

import com.github.JBreno.seguradora.modelo.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem) {
        System.out.println("---------------------");
        System.out.println("PROPOSTA SEGURO");
        System.out.println("---------------------");
        System.out.println(bem.descrever());
        System.out.printf("Prêmio: R$%.2f%n", bem.calcularValorPremio());
    }

}
