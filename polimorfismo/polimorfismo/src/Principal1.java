import com.github.JBreno.banco.Conta;
import com.github.JBreno.banco.ContaEspecial;
import com.github.JBreno.banco.Titular;

public class Principal1 {
    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "123.456.789-10");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 999999, 9);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(100);

        Conta conta = contaEspecial;
    }
}