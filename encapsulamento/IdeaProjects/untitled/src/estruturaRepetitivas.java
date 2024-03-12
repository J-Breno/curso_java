import java.util.Locale;
import java.util.Scanner;

public class estruturaRepetitivas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        double soma;
        soma = 0;

        System.out.print("Digite um número para somar: ");
        num = sc.nextInt();
        soma += num;
        while(num != 0){
            System.out.println("Se quiser parar digite zero logo a baixo");
            System.out.print("Digite um número para somar: ");
            num = sc.nextInt();

            soma += num;
        }
        System.out.println("A soma foi: " + soma);


        int i,n1, soma1;
        soma1 = 0;

        System.out.print("Quantos números você vai somar: ");
        int N = sc.nextInt();

        for(i = 0; i < N; i++){
            System.out.print("Digite um número: ");
            n1 = sc.nextInt();
            soma1 += n1;
        }

        System.out.println("A soma dos números foram: " + soma1);

        for(i = 0; i < 5; i++){
            System.out.println("O valor de i: " + i);
        }

        char letra;
        double c, f;

        do{
            System.out.print("Digite a temperatura em Celsius: ");
            c = sc.nextDouble();
            f = c * 1.8 + 32;
            System.out.println("Equivalente em Fahrenheit: " + f);
            System.out.print("Deseja repetir?[s/n] ");
            letra = sc.next().charAt(0);
        }while(letra != 'n');
        sc.close();
    }
}
