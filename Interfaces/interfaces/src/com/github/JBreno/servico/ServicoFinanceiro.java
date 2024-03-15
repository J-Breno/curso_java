package com.github.JBreno.servico;

import com.github.JBreno.financeira.Empresa;
import com.github.JBreno.financeira.EmpresaFinanciavel;

public class ServicoFinanceiro {

    public void solicitarFinanciamento(EmpresaFinanciavel empresa, double valorSolicitado) {
        double limiteAprovado = empresa.calcularLimiteAprovado();

        if(limiteAprovado < valorSolicitado) {
            throw new RuntimeException(String.format("Financiamento não aprovado. Limite máximo de %.2f%n", limiteAprovado));
        }

        System.out.printf("DEBUG: Financiamento aprovado. Limite máximo de %.2f%n", limiteAprovado);
    }

    public double consultarLimiteAprovado(EmpresaFinanciavel empresa) {
        return empresa.calcularLimiteAprovado();
    }
}
