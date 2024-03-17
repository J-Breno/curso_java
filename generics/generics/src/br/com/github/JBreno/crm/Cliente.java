package br.com.github.JBreno.crm;

public class Cliente implements Nomeavel{

    private String razaoSocial;
    private double faturamentoMensal;

    public Cliente(String razaoSocial, double faturamentoMensal) {
        this.razaoSocial = razaoSocial;
        this.faturamentoMensal = faturamentoMensal;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public double getFaturamentoMensal() {
        return faturamentoMensal;
    }

    public void setFaturamentoMensal(double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }

    public String toString() {
        return "Cliente {" +
                "razaoSocial=" + getRazaoSocial() +
                ", faturamentoMensal=" + getFaturamentoMensal() +
                "}";
    }

    @Override
    public String getNome() {
        return getRazaoSocial();
    }
}
