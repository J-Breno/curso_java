import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CalculadoraImc calculadoraImc = new CalculadoraImc();


        Paciente joao = new Paciente();
        joao.altura = 1.82;
        joao.peso = 75.0;

        IndiceMassaCorporal imc = calculadoraImc.calcular(joao);

        if(imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f está com obesidade", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
