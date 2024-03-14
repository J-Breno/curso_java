import com.github.JBreno.banco.*;

import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("João da Silva", "123.456.789-10"),
                1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1000);

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("João da Silva", "123.456.789-10"),
                1234, 999999 );

        conta2.depositar(100);
        conta2.creditarRendimentos(10);

        ContaSalario conta3 = new ContaSalario(new Titular("João da Silva", "123.456.789-10"),
                1234, 999999 , 18000);
        conta3.depositar(100.0);

        caixaEletronico.imprimirDemonstrativo(conta1);
    }
}