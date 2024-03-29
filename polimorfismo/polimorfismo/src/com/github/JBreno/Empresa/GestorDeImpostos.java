package com.github.JBreno.Empresa;

public class GestorDeImpostos {

    private double valorTotalImpostos;

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }

    public void adicionar(Pessoa pessoa) {
        System.out.printf("Impostos devidos de %s: %.2f%n",
                pessoa.getNome(), pessoa.calcularImpostos());
        valorTotalImpostos += pessoa.calcularImpostos();
    }

}
