package br.com.github.JBreno;

import br.com.github.JBreno.crm.Cliente;
import br.com.github.JBreno.crm.ServicoCadastroCliente;

public class Principal3 {
    public static void main(String[] args) {
        ServicoCadastroCliente servicoCadastroCliente = new ServicoCadastroCliente();
        Cliente clienteCadastrado = servicoCadastroCliente.cadastrar("João", 15);

        System.out.printf("Cliente cadastrado: %s%n", clienteCadastrado.getNome());
    }
}
