package com.github.JBreno.banco;

public class ContaSalario extends Conta{

    private double salaioMensal;

    public ContaSalario(Titular titular, int agencia, int numero, double salaioMensal) {
        super(titular, agencia, numero);
        this.salaioMensal = salaioMensal;
    }

    public double getSalaioMensal() { return salaioMensal; }

    public void setSalaioMensal(double salaioMensal) { this.salaioMensal = salaioMensal; }


}
