package com.github.JBreno.funcionario;

public class Funcionario {

    private String nome;
    private double valorHora;

    public Funcionario(){
    }

    public Funcionario(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    protected double calcularSalario(int horasTrabalhadas) {
        return horasTrabalhadas * valorHora;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno) {
        return new Holerite(getNome(), mesAno, calcularSalario(horasTrabalhadas));
    }

    public String toString() {
        return "";
    }
}
