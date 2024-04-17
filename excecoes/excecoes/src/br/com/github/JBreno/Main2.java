package br.com.github.JBreno;

import br.com.github.JBreno.banco.ContaCorrente;
import br.com.github.JBreno.banco.ContaException;
import br.com.github.JBreno.banco.ContaInativaException;

public class Main2 {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("123");
        ContaCorrente conta2 = new ContaCorrente("987");

        conta1.ativar();
        try {
            conta1.depositar(1000);
            System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
        } catch (ContaInativaException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
        }

        try {
            conta1.transferir(conta2, 500);
            System.out.printf("Saldo da conta 2: %.2f%n", conta2.getSaldo());
        } catch (ContaInativaException e) {
            System.out.println("Erro ao transferir: " + e.getMessage());
        }


    }
}
