import com.github.JBreno.contaspagar.servico.ServicoContaPagar;
import com.github.JBreno.financeira.ClienteFinanciavel;
import com.github.JBreno.financeira.Fazenda;
import com.github.JBreno.financeira.Funcionario;
import com.github.JBreno.financeira.PessoaBonificavel;
import com.github.JBreno.servico.ServicoPagamentoBonus;

public class Principal2 {
    public static void main(String[] args) {
//        ClienteFinanciavel funcionario = new Funcionario("João da Silva", 18000);
//
//        Fazenda fazenda = new Fazenda("Fazenda Dona benedita", 1000000, 5);

        PessoaBonificavel funcionario = new Funcionario("João da Silva", 18000);
//        funcionario.calcularBonus(80);

        ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
        servicoPagamentoBonus.pagar(funcionario, 100);
    }
}
