package com.github.JBreno.funcionario;

public record Holerite(String nome, String mesAno, double valorSalario) {
    public void imprimir() {
        System.out.printf("HOLERITE{nome=%s, mes=%s, valor salario=%s%n", nome, mesAno, valorSalario);
    }
}
