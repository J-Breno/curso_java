package com.github.JBreno.seguradora.modelo;

public class Caminhao extends VeiculoAutomotor{


    private int quantidadeEixos;

    public Caminhao(String modelo,  int anoFabricacao,double valorMercado, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * 2) / 100 + (getQuantidadeEixos() * 50);
    }

    @Override
    public String descrever() {
        StringBuilder sb = new StringBuilder();
        sb.append("Caminhão ");
        sb.append(getModelo());
        sb.append(" ano " + getAnoFabricacao());
        sb.append(", " + getQuantidadeEixos());
        sb.append(" eixos, avaliado em R$");
        sb.append(String.format("%.2f", getValorMercado()));
        return sb.toString();
    }
}
