package com.github.JBreno.contaspagar.modelo;

import com.github.JBreno.pagamento.Beneficiario;
import com.github.JBreno.pagamento.DocumentoPagavel;

public class Holerite implements DocumentoPagavel {

    private Beneficiario funcionario;
    private double valorHora;
    private int quantidadeHoras;

    public Holerite(Beneficiario funcionario, double valorHora, int quantidadeHoras) {
        this.funcionario = funcionario;
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    public Beneficiario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Beneficiario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public double getValorTotal() {
        return valorHora * quantidadeHoras;
    }

    @Override
    public Beneficiario getBeneficiario() {
        return getFuncionario();
    }

}
