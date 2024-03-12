import java.util.Locale;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'M';

        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which price is $ %.1f%n", product1, price1);
        System.out.printf("%s, with price  is $ %.2f%n", product2, price2);

        System.out.println("");
        System.out.println("");

        System.out.printf("Record: %d years old, code %d and gender: %c%n",age, code,gender);

        System.out.println("");
        System.out.println("");

        System.out.printf("Measue with eigth decimal places: %.9f%n", measure);
        System.out.printf("Rouded(there decimal places: %.3f%n", measure);
        System.out.printf(" US decimal point: %.3f%n", measure);

        Scanner sc = new Scanner(System.in); // preciso chamar só uma vez

        String x;
        System.out.print("Digite o seu nome: ");
        x = sc.next();

        System.out.println("Você Digitou: " + x);



        int y;
        System.out.print("Digite a sua idade: ");
        y = sc.nextInt();

        System.out.println(x + " tem " + y + " anos! ");


        Double salario;

        System.out.print("Digite o seu sálario: ");

        salario = sc.nextDouble();

        System.out.println("O seu sálario é: " + salario);


        char a;
        System.out.print("Digite seu sexo: ");
        a = sc.next().charAt(0);

        System.out.println("Seu sexo é: " + a);

        sc.close();


    }
}

