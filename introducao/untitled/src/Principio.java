import java.util.Locale;
import java.util.Scanner;

public class Principio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAssentos = 100;


        aviaoGol.reservarAssentos(10);
        aviaoGol.desativar();

        System.out.printf("GOL (%s): %d assentos disponíveis%n",
                aviaoGol.ativo ? "Ativo": "Inativo",
                aviaoGol.calcularAssentosDisponiveis());
    }


}
