package com.github.JBreno.financeira;

public class Funcionario implements PessoaBonificavel{

    public static final int QUANTIDADE_SALARIO_LIMITE_CREDITO = 5;

    private double salarioMensal;
    private String nome;

    public Funcionario( String nome, double salarioMensal) {
        this.salarioMensal = salarioMensal;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularLimiteAprovado() {
        return getSalarioMensal() * QUANTIDADE_SALARIO_LIMITE_CREDITO;
    }

    @Override
    public double calcularBonus(double percentualMetaAlcancada) {
        return getSalarioMensal() * percentualMetaAlcancada / 100;
    }
}
