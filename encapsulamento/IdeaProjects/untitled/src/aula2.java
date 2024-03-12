import java.util.Scanner;
import java.util.Locale;

public class aula2{
    public static void main(String[] args){
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25.0 = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("O valor absoluto de " + y + " é " + A);
        System.out.println("O valor absoluto de " + z + " é " + B);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " é " + A);
        System.out.println(x + " elevado ao quadrado é " + B);
        System.out.println("5 elevado ao quadrado é " + C);

        double delta , b, a, c, x1, x2;
        a = 5;
        c = 3;
        b = 9;

        delta = Math.pow(b, 2.0) - 4* a *c;

        System.out.println("Esse é o valor de delta: " + delta);

        x1 = (-b + Math.sqrt(delta) / 2.0 * a);
        x2 = (-b - Math.sqrt(delta) / 2.0 * a);

        System.out.println("O valor de x1 é: " + x1);
        System.out.println("O valor de x2 é: " + x2);

    }
}