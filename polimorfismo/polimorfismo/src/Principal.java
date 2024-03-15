import com.github.JBreno.Empresa.GestorDeImpostos;
import com.github.JBreno.Empresa.PessoaFisica;
import com.github.JBreno.banco.*;
import com.github.JBreno.fiscal.GestorFiscal;
import com.github.JBreno.fiscal.NotaFiscal;
import com.github.JBreno.fiscal.NotaFiscalProduto;
import com.github.JBreno.fiscal.NotaFiscalServico;

import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var gestorImpostos = new GestorDeImpostos();

        var joao = new PessoaFisica("João da Silva", 4500);
        var maria = new PessoaFisica("Maria Souza", 180000);

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);

        System.out.printf("Total de impostos: %.2f%n", gestorImpostos.getValorTotalImpostos());
    }
}