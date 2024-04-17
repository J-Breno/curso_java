package br.com.github.JBreno.banco;

public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean ativo;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isInativo() {
        return !isAtivo();
    }

    public void ativar() {
        this.ativo = true;
    }

    public void inativar() {
        this.ativo = false;
    }

    public boolean sacar(double valor) {
        if(valor <= 0) {
            System.out.println("Valor de saque deve ser maior que 0");
            return false;
        }

        if(valor > this.saldo) {
            System.out.println("Conta sem saldo");
            return false;
        }

        if(isInativo()) {
            System.out.println("Conta inativa");
            return false;
        }

        this.saldo -= valor;
        return true;
    }

    public boolean depositar(double valor) throws ContaInativaException{
        if(valor <= 0) {
            System.out.println("Valor de depósito deve ser maior que 0");
        }

        if(isInativo()){
            throw new ContaInativaException("Conta invativa");
        }

        this.saldo += valor;
        return true;
    }

    public boolean transferir(ContaCorrente contaDestino, double valor) throws ContaInativaException {
        if(contaDestino.isInativo()) {
           throw new ContaInativaException("Conta inativa");
        }

        if(sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }

        return false;
    }
}
