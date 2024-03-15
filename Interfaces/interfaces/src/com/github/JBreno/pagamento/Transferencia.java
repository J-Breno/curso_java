package com.github.JBreno.pagamento;

public class Transferencia implements  MetodoPagamento{



    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if(beneficiario.naoPossuiContaBancaria()) {
            throw new RuntimeException("Beneficiário não possui conta bancaria");
        }

        System.out.printf("DEBUG: Efetuando TRANSFERÊNCIA para %s no valor de %.2f para conta bancária %s%n",
                beneficiario.getNome(), documento.getValorTotal(), beneficiario.getContaBancaria());

    }
}
