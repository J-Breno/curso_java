import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o maior numero: ");
        int maiorIntPrimeiro = sc.nextInt();
        int maiorIntSegundo = sc.nextInt();
        System.out.println(NumeroUtil.maiorNumero(maiorIntPrimeiro,maiorIntSegundo));

    }
}
