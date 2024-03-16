package com.github.JBreno.seguradora.modelo;

public class ImovelResidencial implements BemSeguravel{

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * 0.1) / 100  + (0.3 * getAreaConstruida()) ;
    }

    @Override
    public String descrever() {
        StringBuilder sb = new StringBuilder();
        sb.append("Imóvel residencial com ");
        sb.append(getAreaConstruida() + "m2 de área construída, avaliado em R$");
        sb.append(getValorMercado());
        return sb.toString();
    }
}
