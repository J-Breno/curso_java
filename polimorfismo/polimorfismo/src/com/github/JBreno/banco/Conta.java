package com.github.JBreno.banco;

public class Conta {

    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta( Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Titular getTitular() { return titular; }

    public int getAgencia() { return agencia; }

    public int getNumero() { return numero; }

    public double getSaldo() { return saldo; }


    protected void validarSaldoParaSaque(double valorSaque) {
        if(getSaldo() < valorSaque ) {
            throw new IllegalArgumentException("Valor do saque deve ser maior do que 0");
        }

        validarSaldoParaSaque(valorSaque);

        saldo -= valorSaque;
    }

    public void sacar(double valorSaque) {
        if(valorSaque <= 0) {
            throw  new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }

        validarSaldoParaSaque(valorSaque);

        saldo -= valorSaque;
    }

    public final void depositar(double valorDeposito) {
        if(valorDeposito <= 0) {
            throw new IllegalArgumentException("Valor do deposito deve ser maior que 0");
        }

        saldo += valorDeposito;
    }

    public void imprimirDemonstrativo() {
        System.out.println();
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular=" + titular +
                ", agencia=" + agencia +
                ", numero=" + numero +
                "}";
    }
}
