import com.github.JBreno.banco.*;

public class Principal2 {
    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "123.456.789-10");
        Conta conta = new ContaSalario(titular, 1234, 999999, 18.000);


    }
}