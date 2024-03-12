import java.util.Locale;
import java.util.Scanner;

public class exercicios2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if(num < 0){
            System.out.println("Negativo");
        }else{
            System.out.println("Não Negativo");
        }

        int calculo;



        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Par!");
        }else{
            System.out.println("Impar!");
        }

        int a,b,c;
        int resultado;

        System.out.print("Digite um número: ");
        a = sc.nextInt();
        System.out.print("Digite outro número: ");
        b = sc.nextInt();

        if(a > b){
            c = a;
            a = b;
            b = c;

        }

        resultado = b / a;

        if(a * resultado == b){
            System.out.println("São múltiplos!");
        }
        else{
            System.out.println("Não são múltiplos!");
        }

        int x,y;
        System.out.print("Digite horário de inicio: ");
        x = sc.nextInt();
        System.out.print("Digite horário final: ");
        y = sc.nextInt();


        if (x == y) {
            resultado = 24;
            if (resultado >=1 && resultado <=24) {
                System.out.println("O jogo durou " + resultado + " Hora(s)!");
            }
            else{
                System.out.println("Horário desconhecido!");
            }
        }
        else if (x > y) {
            resultado = (24 - x) + y;
            if (resultado >=1 && resultado <=24) {
                System.out.println("O jogo durou " + resultado + " Hora(s)!");
            }
            else{
                System.out.println("Horário desconhecido!");
            }
        }
        else {
            resultado = y - x;
            if (resultado >=1 && resultado <=24) {
                System.out.println("O jogo durou " + resultado + " Hora(s)!");
            }
            else{
                System.out.println("Horário desconhecido!");
            }
        }

        int n1,n2;
        double valor;
        System.out.print("Digite o código: ");
        n1 = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        n2 = sc.nextInt();

        if(n1 == 1){
            valor = n2 * 4.00;
            System.out.printf("Total: R$%.2f%n", valor);
        }
        else if(n1 == 2){
            valor = n2 * 4.50;
            System.out.printf("Total: R$%.2f%n", valor);
        }
        else if(n1 == 3){
            valor = n2 * 5.00;
            System.out.printf("Total: R$ %.2f%n",valor);
        }
        else if(n1 == 4){
            valor = n2 * 2.00;
            System.out.printf("Total: R$ %.2f%n", valor);
        }
        else{
            valor = n2 * 1.50;
            System.out.printf("Total: R$ %.2f%n", valor);
        }

        double intervalo;

        System.out.print("Digite o valor: ");
        intervalo = sc.nextDouble();

        if(intervalo >= 0 && intervalo <= 100){
            if(intervalo >= 0 && intervalo <=25){
                System.out.println("Intervalo [0, 25]");
            }
            else if(intervalo <= 50){
                System.out.println("Intervalo [25, 50]");
            }
            else if(intervalo <= 75){
                System.out.println("Intervalo [50, 75]");
            }
            else{
                System.out.println("Intervalo [75, 100]");
            }
        }
        else{
            System.out.println("Fora do intervalo");
        }

        double x1,y1;

        System.out.print("Digite o primeiro eixo: ");
        x1 = sc.nextDouble();
        System.out.print("Digite o segundo eixo: ");
        y1 = sc.nextDouble();

        if(x1 > 0 && y1 > 0){
            System.out.println("Q1");
        }
        else if(x1 < 0 && y1 > 0){
            System.out.println("Q2");
        }
        else if(x1 < 0 && y1 < 0){
            System.out.println("Q3");
        }
        else if(x1 > 0 && y1 < 0){
            System.out.println("Q4");
        }
        else{
            System.out.println("Origem!");
        }

        double salario;
        double imposto;

        System.out.print("Digite o seu salário: ");
        salario = sc.nextDouble();

        if(salario >= 0 && salario <= 2000){

            System.out.println("Insento");
        }
        else if(salario <= 3000){
            imposto = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        }
        else if(salario <= 4500){
            imposto =  (salario - 3000) * 0.18 + 1000 * 0.08 ;
            System.out.printf("R$ %.2f%n", imposto);
        }
        else if(salario > 4500){
            imposto = (salario - 4500) * 0.20 + 1500 * 0.18 + 1000 * 0.08 ;
            System.out.printf("R$ %.2f%n", imposto);
        }

        int num1;
        double valor1;

        System.out.print("Digite os minutos: ");
        num1 = sc.nextInt();

        if (num1 <= 100){
            valor1 = 50;
            System.out.printf("Valor a pagar: R$%.2f%n", valor1);
        }
        else{
            valor1 = 50;
            valor1 += ((num1 - 100) * 2.00);
            System.out.printf("O valor a pagar: R$%.2f%n", valor1);
        }
        int z;
        

        System.out.print("Digite o dia: ");
        z = sc.nextInt();
        String dia = null;

        switch (z){
        case 1:
            dia = "Domigo";
            break;
        case 2:
            dia = "Segunda";
            break;
        case 3:
            dia = "Terça";
            break;
        case 4:
            dia = "Quarta";
            break;
        case 5:
            dia = "Quinta";
            break;
        case 6:
            dia = "Sexta";
            break;
        case 7:
            dia = "Sabado";
            break;
        default:
            dia = "Valor invalido";
        }

        System.out.println("Dia da semana: " + dia);


        double preco2 = 34.5;
        double desconto = (preco2 < 20) ? preco2 * 0.1 : preco2 * 0.5;
        System.out.println("Seu desconto é: " + desconto);




        sc.close();
    }
}