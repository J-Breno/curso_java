import java.util.Scanner;
import java.util.Locale;

public class OrientacaoObjeto1 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite três números do triangulo1: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.print("Digite três números do triangulo2: ");
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();


        double p1 = (a + b + c ) / 2.0;
        double p2 = (d + e + f) / 2.0;

        double area1 = p1 * (p1 - a) * (p1 - b) * (p1 - c);
        double area2 = p2 * (p2 - d) * (p2 - e) * (p2 - f);

        double raiz1 = Math.sqrt(area1);
        double raiz2 = Math.sqrt(area2);

        System.out.printf("Area do triangulo1: %.4f%n",raiz1);
        System.out.printf("Area do triangulo2: %.4f%n",raiz2);

        if(raiz1 > raiz2){
            System.out.println("Larger area: triangulo1");
        }
        else{
            System.out.println("Larger area: triangulo2");
        }



        sc.close();

    }
}
