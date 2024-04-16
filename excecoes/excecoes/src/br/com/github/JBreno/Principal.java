package br.com.github.JBreno;

import br.com.github.JBreno.estoque.Produto;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Xbox");
//        produto.ativar();
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
            } catch (IllegalArgumentException iae) {
                System.out.println( "Erro na compra: " + iae.getMessage());
            } catch (IllegalStateException ise) {
                System.out.println("Erro na compra: " + ise.getMessage());
                System.out.print("Deseja ativar o produto? ");
                if(scanner.nextBoolean()) {
                    produto.ativar();
                    System.out.println("Ok. Produto está ativado");
                } else {
                    System.out.println("Ok. Compra não pode ser realizada");
                    break;
                }
            }

        } while(true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidadeEstoque) {
//        try{
            produto.retirarEstoque(quantidadeEstoque);
            System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
                    quantidadeEstoque, produto.getQuantidadeEstoque());
//        } catch (IllegalArgumentException iae) {
//            System.out.println("Erro ao efetuar baixa no estoque: " + iae.getMessage());
//            throw iae;
//        }


    }
}
