import com.github.JBreno.banco.Conta;
import com.github.JBreno.banco.Titular;

public class Main1 {
    public static void main(String[] args) {
        Conta conta1 = new Conta(); // se você comparar um objeto com outro usando ==, deesse jeito:
        //  Conta conta1 = new Conta();
        //  Conta conta2 = conta1;
        // eles vão dar iguais, pois o == olha o valor da referncia na memoria
        // já o Object.equals olha o valor em si, das variaveis, mas você tera que sobrescrever o equals


        conta1.setTitular(new Titular("João Breno", "xxx.xxx.xxx-xx"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();
        conta1.sacar(27.5);
        conta1.imprimirDemonstrativo();

    }
}