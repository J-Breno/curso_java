import com.github.JBreno.banco.CaixaEletronico;
import com.github.JBreno.banco.Conta;
import com.github.JBreno.banco.ContaEspecial;
import com.github.JBreno.banco.Titular;

import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("João da Silva", "123.456.789-10"),
                1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1000);

        ContaEspecial conta2 = new ContaEspecial(new Titular("Maria Joana", "xxx.yyy.zzz-aa"),
                2222, 888888, 90);

        conta1.depositar(300);

        caixaEletronico.transferir(conta1, conta2, 50);
        conta1.imprimirDemonstrativo();
        conta2.imprimirDemonstrativo();
    }
}