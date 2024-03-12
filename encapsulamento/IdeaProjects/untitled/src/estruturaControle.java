import java.util.Locale;
import java.util.Scanner;

public class estruturaControle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int a;

        System.out.print("Digite um horário: ");
        a = sc.nextInt();

        if (a < 12) {
            System.out.println("Bom dia!");
        }
        else if (a < 18) {
            System.out.println("Boa tarde!");
        }
        else{
            System.out.println("Boa noite!");
        }

        sc.close();
    }
}