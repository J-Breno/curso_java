package com.github.JBreno.financeira;

public class Fazenda  extends  EmpresaFinanciavel{

    public static final double PERCENTUAL_FATURAMENTO_LIMITE_CREDITO = 0.5;
    public static final double TAXA_ACRESCIMO_LIMITE_PARA_GRANDE_PRODUTIVIDADE = 1.2;
    public static final double TAMANHO_MINIMO_EM_HECTARES_GRANDE_PROPRIEDADE = 5;

    private double tamanhoEmHectare;

    public Fazenda(String razaoSocial, double totalFaturamento, double tamanhoEmHectare) {
        super(razaoSocial, totalFaturamento);
        this.tamanhoEmHectare = tamanhoEmHectare;
    }

    public double getTamanhoEmHectare() {
        return tamanhoEmHectare;
    }

    @Override
    public double calcularLimiteAprovado() {
        double limiteAprovado = getTotalFaturamento() * PERCENTUAL_FATURAMENTO_LIMITE_CREDITO;

        if(getTamanhoEmHectare() >= TAXA_ACRESCIMO_LIMITE_PARA_GRANDE_PRODUTIVIDADE) {
            limiteAprovado *= TAXA_ACRESCIMO_LIMITE_PARA_GRANDE_PRODUTIVIDADE;
        }

        return limiteAprovado                               ;
    }
}
