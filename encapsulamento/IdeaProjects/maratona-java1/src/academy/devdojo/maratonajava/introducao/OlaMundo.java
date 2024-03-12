package academy.devdojo.maratonajava.introducao;

import java.nio.file.FileSystemNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x1,x2,x3,y1,y2,y3,pX,pY,mediaX,mediaY;
        System.out.println("Enter the measures of triangle X:");
        x1 = sc.nextDouble();
        x2 = sc.nextDouble();
        x3 = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        y1 = sc.nextDouble();
        y2 = sc.nextDouble();
        y3 = sc.nextDouble();
        pX = (x1 + x2 + x3) / 2.0;
        pY = (y1 + y2 + y3) / 2.0;
        mediaX = Math.sqrt(pX * (pX - x1) * (pX - x2) * (pX - x3));
        mediaY = Math.sqrt(pY * (pY - y1) * (pY - y2) * (pY - y3));
        System.out.printf("Triangle X area: %.4f%n", mediaX);
        System.out.printf("Triangle Y area: %.4f%n", mediaY);

        if(mediaX > mediaY){
            System.out.println("Larger area: X");
        } else if (mediaY > mediaX) {
            System.out.println("Larger area: Y");
        }else{
            System.out.println("As médias são iguais");
        }
    }
}
