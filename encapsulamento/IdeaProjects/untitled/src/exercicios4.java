import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Locale;
import java.util.Scanner;

public class exercicios4 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x,n;
        n = 1;
        System.out.print("Digite um número: ");
        x = sc.nextInt();

        if(x >= 1 && x <= 1000){
            for(int i = 0; n <= x; i++){
                System.out.println(n);
                n +=2;
            }
        }

        int y,num;
        int in =0;
        int out = 0;

        System.out.print("Digite a quantidade de números que serão lidos: ");
        y = sc.nextInt();

        for( int i = 0 ; i < y;i++){
            System.out.print("Digite o valor: ");
            num = sc.nextInt();
            if(num >= 10 && num <= 20){
                in +=1;
            }
            else{
                out +=1;
            }
        }


        System.out.println(in + " in");
        System.out.println(out + " out");



        int a;
        double valor1, valor2, valor3, media1, media2, media3;
        int cont;
        cont = 0;
        media1 = 0;
        media2 = 0;
        media3 = 0;
        System.out.print("Digite o indice: ");
        a = sc.nextInt();

        for (int i = 0; i < a; i++){
            double soma = 0;
            System.out.print("Digite o valor: ");
            for(y = 0; y < 1; y++){
                valor1 = sc.nextDouble(); valor2 = sc.nextDouble();
                valor3 = sc.nextDouble();
                soma = (valor1 * 2) + (valor2 * 3) + (valor3 * 5);
                cont += 1;
            }
            if (cont == 1){
                media1 = soma / 10;
            }
            else if(cont == 2){
                media2 = soma / 10;
            }
            else{
                media3 = soma / 10;
            }
        }

        System.out.println("A media ponderada dos valores são: ");
        System.out.printf("Primeiro valor: %.1f%n", media1);
        System.out.printf("Segundo valor: %.1f%n", media2);
        System.out.printf("Terceiro valor: %.1f%n", media3);



        int o;
        double num2,num3;
        double div;

        System.out.printf("Digite o número de vezes: ");
        o = sc.nextInt();

        for(int i = 0; i < o; i++){
            System.out.print("Digite os valores: ");
            num2 = sc.nextDouble();
            num3 = sc.nextDouble();
            if(num3 == 0){
                System.out.println("Divisão impossível");
            }
            else{
                div =  num2 / num3;
                System.out.printf("Resultado: %.1f%n", div);
            }

        }

        int u;

        System.out.print("Digite o número que você quer fatoriar: ");
        u = sc.nextInt();

        for( int i = u-1; i >= 1; i--){
            u = u * (i);

        }
        if(u == 0){
            u = 1;
        }
        System.out.println(u);


        int t,divisor;

        System.out.print("Digite o número divisor: ");
        t = sc.nextInt();

        for(int i = 1; i <= t; i++){
            divisor = t / i;
            if(divisor * i == t){
                System.out.println(i);
            }
        }

        int r;

        System.out.println("Digite o número que você quer potenciar: ");
        r = sc.nextInt();
        for(int i = 1; i <= r; i++){
            System.out.println(i + " " + Math.pow(i,2) + " "+ Math.pow(i,3));
        }
        sc.close();
    }
}