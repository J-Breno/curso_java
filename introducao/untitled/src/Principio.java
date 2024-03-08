import java.util.Locale;
import java.util.Scanner;

public class Principio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga o valor da base: ");
        CalcularFormulaGeometrica.base = sc.nextDouble();
        System.out.print("Diga o valor da altura: ");
        CalcularFormulaGeometrica.altura = sc.nextDouble();
        System.out.printf("O valor da área do quadrado é: %.2f%n",
                CalcularFormulaGeometrica.areaDoQuadrado());
        System.out.printf("O valor da área do Circulo é: %.2f%n",
                CalcularFormulaGeometrica.areaDoCirculo());
        ;
    }


}
