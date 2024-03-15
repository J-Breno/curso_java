package com.github.JBreno.financeira;

public class Funcionario extends EmpresaFinanciavel{

    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        super(nome, 0);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularLimiteAprovado() {
        return 0;
    }
}
