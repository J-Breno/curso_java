import com.github.JBreno.seguradora.modelo.Caminhao;
import com.github.JBreno.seguradora.modelo.CarroParticular;
import com.github.JBreno.seguradora.modelo.ImovelResidencial;
import com.github.JBreno.seguradora.servico.ServicoPropostaSeguro;
import com.github.JBreno.servico.ServicoPagamentoBonus;

import java.util.Locale;

public class Main2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();
        CarroParticular carro = new CarroParticular("HR-V", 2022, 150000);
        Caminhao caminhao = new Caminhao("Actros", 2021, 780000, 4);
        ImovelResidencial imovel = new ImovelResidencial(2300000, 320);

        servicoPropostaSeguro.emitir(carro);
        servicoPropostaSeguro.emitir(caminhao);
        servicoPropostaSeguro.emitir(imovel);
    }
}
