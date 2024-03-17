import br.com.github.JBreno.crm.Cliente;
import br.com.github.JBreno.crm.Funcionario;
import br.com.github.JBreno.crm.Pesquisador;

public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = {
                new Funcionario("João", 40),
                new Funcionario("José", 20),
                new Funcionario("Maria", 30)
        };

       Cliente[] clientes = {
               new Cliente("Supermercado Pague e Leve", 2000000),
               new Cliente("Posto Gasolina Boa", 800000),
               new Cliente("Javac Consultoria", 58000000)
       };

        Cliente funcionarioEncontrado = Pesquisador.obterPorNome(clientes, "Javac Consultoria");
        System.out.println(funcionarioEncontrado);
    }
}