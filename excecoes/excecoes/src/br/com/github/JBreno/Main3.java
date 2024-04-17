package br.com.github.JBreno;

import br.com.github.JBreno.banco.ContaCorrente;
import br.com.github.JBreno.banco.ContaException;

public class Main3 {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("123");
        ContaCorrente conta2 = new ContaCorrente("987");

        conta1.ativar();
        conta2.ativar();
        try{
            conta1.depositar(1_000);
            conta2.depositar(1_200);

            System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
            System.out.printf("Saldo da conta 2: %.2f%n", conta2.getSaldo());
        } catch (ContaException e){
            System.out.println("Erro ao depositar: " + e.getMessage());
        }

    }
}
