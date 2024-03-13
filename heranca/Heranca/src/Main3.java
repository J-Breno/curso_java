import com.github.JBreno.banco.Conta;
import com.github.JBreno.banco.ContaEspecial;
import com.github.JBreno.banco.Titular;
import com.sun.tools.jconsole.JConsoleContext;

public class Main3 {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial();
        conta1.setTitular(new Titular("João Breno", "xxx.xxx.xxx-xx"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);
        conta1.setLimiteChequeEspecial(1000);
        conta1.setTarifaMensal(90);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(200);
        conta1.imprimirDemonstrativo();

        conta1.debitarTarifaMensal();
        conta1.imprimirDemonstrativo();
    }
}