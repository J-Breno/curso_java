import java.util.Locale;
import java.util.Scanner;

public class exercicios1{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y, soma;
        x = 10;
        y = 30;
        soma = x + y;

        System.out.println("A soma de " + x + " + " + y + " é igual a: " + soma);

        double pi, raio, calculo;

        pi = 3.14159;
        raio = Math.pow(150.00, 2.0);
        calculo = pi * raio;

        System.out.printf("O valor do do raio de um circulo é: %.4f%n",  calculo);

        int A,B,C,D, diferenca;
        A = 5;
        B = 6;
        C = 7;
        D = 8;
        diferenca = (A * B - C * D);

        System.out.println("Diferença =" + diferenca);

        double h,s,salario;
        int n;

        n = 25;
        h = 100.0;
        s = 5.50;
        salario = h * s;

        System.out.println("Number = " + n);
        System.out.println("Salary = $ " + salario);

        double v1 ,v2 , v3;
        double triangulo, circulo,trapezio, quadrado, retangulo;

        v1 = 3.0;
        v2 = 4.0;
        v3 = 5.2;

        triangulo = (v1 * v3) / 2.0;
        circulo = Math.pow(v3, 2.0) * 3.14159;
        trapezio = ((v1 + v2) * v3 )/ 2.0;
        quadrado = v2 * v2;
        retangulo = v1 * v2;

        System.out.printf("Triangulo: %.3f%n", triangulo);
        System.out.printf("Cirulo: %.3f%n", circulo);
        System.out.printf("Trapezio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retangulo: %.3f%n", retangulo);

        int cod,cod2, peca,peca2;
        double valor,valor2, pagar1,pagar2,pagartotal;


        System.out.print("Digite o código: ");
        cod = sc.nextInt();
        System.out.print("Digite o valor do segundo código: ");
        cod2 = sc.nextInt();
        System.out.print("Digite a quantidade de peça: ");
        peca = sc.nextInt();
        System.out.print("Digite a segunda quantidade de peça: ");
        peca2 = sc.nextInt();
        System.out.print("Digite o valor unitário: ");
        valor = sc.nextDouble();
        System.out.print("Digite o segundo valor unitário: ");
        valor2 = sc.nextDouble();

        pagar1 = peca * valor;
        pagar2 = peca2 * valor2;
        pagartotal = pagar1 + pagar2;

        System.out.printf("Valor a pagar: R$ %.2f%n", pagartotal);

    }
}