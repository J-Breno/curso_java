import com.github.JBreno.Empresa.*;

import java.util.Locale;

public class Principal2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        var gestorImpostos = new GestorDeImpostos();

        var joao = new PessoaFisica("João da silva", 45500);
        var maria = new PessoaFisica("Maria Souza", 180000);

        var barDoZe = new EmpresaSimples("Bar do Zé",
                250000, 160000);
        var codeConsultoria = new EmpresaLucroReal("Code Consultoria",
                8000000, 6000000);

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);
        gestorImpostos.adicionar(barDoZe);
        gestorImpostos.adicionar(codeConsultoria);

        System.out.printf("Total de impostos: %.2f%n", gestorImpostos.getValorTotalImpostos());
    }
}
