package com.github.JBreno.financeiro;

public class Principal {

    public static void main(String[] args) {
        var imobiliaria = new Fornecedor("Zé Negócios Imobiliários");

        var contaAluguel = new ContaPagar();
        contaAluguel.setDescricao("Aluguel do apartamento");
        contaAluguel.setValor(4500);
        contaAluguel.setDataVencimento("10/07/2022");
        contaAluguel.setFornecedor(imobiliaria);
        imprimirConta(contaAluguel);
        contaAluguel.pagar();
        imprimirConta(contaAluguel);

        // Pagar o mesma conta novamente deve ser impedido
        //contaAluguel.pagar();

        contaAluguel.cancelarPagamento();
        imprimirConta(contaAluguel);

        // Cancelar o pagamento de uma conta pendente  deve ser impedido
        //contaAluguel.cancelarPagamento();
    }
    
    public static void imprimirConta(ContaPagar conta) {
        System.out.printf("Fornecedor: %s%n", conta.getFornecedor().getName());
        System.out.printf("Descrição: %s%n", conta.getDescricao());
        System.out.printf("Data de vencimento: %s%n", conta.getDataVencimento());
        System.out.printf("Valor: R$%.2f%n", conta.getValor());
        System.out.printf("Pago: %s%n", conta.isPago() ? "Sim" : "Não");
        System.out.println();
    }
}
