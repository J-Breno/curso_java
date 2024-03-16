import br.com.github.JBreno.crm.Cliente;
import br.com.github.JBreno.crm.Sorteador;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        String[] nomes = {"João", "Breno", "Souza", "Melo"};
        String nomeSorteado = Sorteador.<String>sortear(nomes);
        System.out.println(nomeSorteado);

       Cliente[] clientes = {
               new Cliente("Supermercado Pague e Leve", 2000000),
               new Cliente("Posto Gasolina Boa", 800000),
               new Cliente("Javac Consultoria", 58000000)
       };

       Cliente clienteSorteado = Sorteador.<Cliente>sortear(clientes);
        System.out.println(clienteSorteado.getRazaoSocial());
    }
}