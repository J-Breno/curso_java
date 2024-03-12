import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.Locale;
import java.util.Scanner;


public class funcoes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite três numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a,b,c);

        showResault(higher);
        sc.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        }
        else if(y > z){
            aux = y;
        }
        else{
            aux = z;
        }
        return aux;

    }

    public static void showResault(int value){
        System.out.println("Higher =" + value);
    }
}