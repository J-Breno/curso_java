import com.github.JBreno.financeira.Fazenda;
import com.github.JBreno.financeira.Funcionario;
import com.github.JBreno.financeira.Industria;
import com.github.JBreno.financeira.ParceiroFinanceiro;
import com.github.JBreno.servico.ServicoFinanceiro;

public class Principal {
    public static void main(String[] args) {
        var servicoFinanceiro = new ServicoFinanceiro();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5000000, 5);
        var industria = new Industria("Alimentos da Vovó", 900000, true);
        var parceiro = new ParceiroFinanceiro("Capital ABC", 2000000);
        var funcionario = new Funcionario("João da Silva", 18000);

        servicoFinanceiro.solicitarFinanciamento(funcionario, 90000);
//        servicoFinanceiro.solicitarFinanciamento(fazenda, 600000);
//        servicoFinanceiro.solicitarFinanciamento(industria, 600000);

    }
}
