package com.github.JBreno.financeira;

public interface PessoaBonificavel extends ClienteFinanciavel{

    double calcularBonus( double percentualMetaAlcancada );

}
