package br.com.github.JBreno.estoque;

public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isEmpty()) {
            throw new NullPointerException("Nome deve ser preenchido");
        }
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isInativo() {
        return !isAtivo();
    }

    public void desativar() {
        this.ativo = false;
    }

    public void ativar() {
        this.ativo = true;
    }

    public void retirarEstoque(int quantidade) {
        if(quantidade < 0) {
            throw new IllegalArgumentException(
                            "Quantidade não pode ser negativa para retirada no estoque");
        }

        if(isInativo()) {
            throw new IllegalStateException("Retirada no estoque não pode ser realizada em produto inativo");
        }

        if(this.quantidadeEstoque - quantidade < 0) {
            throw new IllegalArgumentException("Quantidade inválida porque estoque ficaria nagativo");
        }

        this.quantidadeEstoque -= quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }
}
