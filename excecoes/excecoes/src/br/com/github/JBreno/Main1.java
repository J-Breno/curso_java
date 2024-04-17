package br.com.github.JBreno;

import br.com.github.JBreno.banco.ContaCorrente;
import br.com.github.JBreno.banco.ContaInativaException;

public class Main1 {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        try {
            conta1.depositar(1_000);
            System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
        } catch (ContaInativaException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
        }

    }
}
