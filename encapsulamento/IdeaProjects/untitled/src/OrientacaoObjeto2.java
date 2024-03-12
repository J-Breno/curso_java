import java.util.Scanner;
import java.util.Locale;
import entidades.Triangulo;

public class OrientacaoObjeto2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangulo x, y;

        x = new Triangulo();
        y =  new Triangulo();

        System.out.println("Digite o primeiro triangulo: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite o segundo triangulo: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = x.area();


        System.out.printf("Triangulo X: %.4f%n", areaX);
        System.out.printf("Triangulo Y: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Larger area: X");
        }
        else{
            System.out.println("Larger area: Y");
        }
        sc.close();

    }
}