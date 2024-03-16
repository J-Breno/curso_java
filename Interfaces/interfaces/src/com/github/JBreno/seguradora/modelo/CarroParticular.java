package com.github.JBreno.seguradora.modelo;

public class CarroParticular extends VeiculoAutomotor {

    public CarroParticular(String modelo, int anoFabricacao, double valorMercado) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {

        if(getAnoFabricacao() < 2000) {
            return (getValorMercado() * 4 / 100) + (getValorMercado() * 5 / 100);
        }

        return getValorMercado() * 4 / 100;
    }

    @Override
    public String descrever() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carro particular ");
        sb.append(getModelo());
        sb.append(" ano " );
        sb.append( getAnoFabricacao());
        sb.append(", avaliado em R$");
        sb.append(String.format("%.2f", getValorMercado()));
        return sb.toString();
    }
}
