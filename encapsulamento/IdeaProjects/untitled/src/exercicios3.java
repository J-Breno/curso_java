import java.util.Locale;
import java.util.Scanner;

public class exercicios3 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senha, cont;

        System.out.print("Digite a senha: ");
        senha = sc.nextInt();


        cont = 1;

        while(senha != 2002) {
            System.out.println("Senha Inválida!");
            if (cont < 3) {
                System.out.print("Digite a senha novamente: ");
                senha = sc.nextInt();
                cont += 1;
            }
            else{
                System.out.println("Você tentou mais de 3 vezes");
                break;
            }
        }

        if(senha == 2002){
            System.out.println("Senha válida!");
        }

        int x, y;

        System.out.print("Digite o primeiro número: ");
        x = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        y = sc.nextInt();

        while(x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("Primeiro");
            }
            else if(x < 0 && y > 0){
                System.out.println("Segundo");
            }
            else if(x < 0 && y < 0){
                System.out.println("Terceiro");
            }
            else if(x > 0 && y < 0){
                System.out.println("Quarto");
            }

            System.out.print("Digite o primeiro número: ");
            x = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            y = sc.nextInt();
        }

        System.out.println("Fim do programa!");


        int num,alcool,gasolina,disel;
        gasolina = 0;
        alcool = 0;
        disel = 0;

        System.out.println("1 - Alcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Disel");
        System.out.println("4 - Fim");
        System.out.print("Digite o código: ");
        num = sc.nextInt();

        while(num != 4){
            if(num == 1){
                alcool += 1;
            }
            else if(num == 2){
                gasolina += 1;
            }
            else if (num == 3) {
                disel += 1;
            }



            System.out.println("1 - Alcool");
            System.out.println("2 - Gasolina");
            System.out.println("3 - Disel");
            System.out.println("4 - Fim");
            System.out.print("Digite o código: ");
            num = sc.nextInt();
            }
        System.out.println("OBRIGADO!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Disel: " + disel);

        sc.close();
        }


    }
