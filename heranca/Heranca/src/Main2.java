import com.github.JBreno.banco.Conta;
import com.github.JBreno.banco.ContaInvestimento;
import com.github.JBreno.banco.Titular;

public class Main2 {
    public static void main(String[] args) {
        ContaInvestimento conta1 = new ContaInvestimento();
        conta1.setTitular(new Titular("João Breno", "xxx.xxx.xxx-xx"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.creditarRendimentos(6);
        conta1.imprimirDemonstrativo();
    }
}