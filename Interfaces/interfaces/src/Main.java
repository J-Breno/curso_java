import com.github.JBreno.contaspagar.modelo.Holerite;
import com.github.JBreno.contaspagar.modelo.OrdemServico;
import com.github.JBreno.contaspagar.servico.ServicoContaPagar;
import com.github.JBreno.pagamento.*;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // os contatos, padrões são chamados de interfaces
        // uma interface é um contrato que especifica o que alguma coisa vai fazer

        // tipo o pedal do freio, ele não faz o carro parar, ele apenas aciona a coisa
        // que faz o carro parar;

        // as interfaces fazem o meio de campo dessa comunicação

        // outro exemplo é uma tv, que tem um botão de ligar, não é o botão que liga, mas
        // ele aciona o mecanismo que ligag
        Locale.setDefault(Locale.US);

        MetodoPagamento pagamento = new Transferencia();

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(pagamento);

        Beneficiario funcionario = new Beneficiario("João da Sulva", "99 999999999",
                "123456");

        Holerite holerite = new Holerite(funcionario, 100, 168);


        Beneficiario fornecedor = new Beneficiario("Consultoria xyz",
                "10687134983839", "34214");
        OrdemServico os = new OrdemServico(fornecedor, 65500);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(os);
    }
}