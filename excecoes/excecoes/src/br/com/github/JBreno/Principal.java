package br.com.github.JBreno;

import br.com.github.JBreno.estoque.*;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Xbox");
        produto.ativar();
        produto.adicionarEstoque(20);

        comprar(produto);
    }

    private static void comprar(Produto produto) {
        Scanner scanner = new Scanner(System.in);
        do {
            try{
                System.out.print("Quantidade de Estoque: ");
                int quantidadeEstoque = scanner.nextInt();

                efetuarBaixaEstoque(produto, quantidadeEstoque);
                System.out.println("Compra efetuada com sucesso!");
                break;
            } catch (BaixaEstoqueException e) {
                System.out.println( "Erro na compra: " + e.getCause().getMessage());
            }
        } while(true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidadeEstoque)
            throws BaixaEstoqueException {
        try {
            produto.retirarEstoque(quantidadeEstoque);
            System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
                    quantidadeEstoque, produto.getQuantidadeEstoque());
        } catch (IllegalArgumentException | ProdutoException e) {
            throw new BaixaEstoqueException("Erro ao realizar baixa no estoque", e);
        }
    }
}
