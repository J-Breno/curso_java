import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        var meuCarro = new Carro();  // o new está instanciando, criando um objeto carro
        meuCarro.modelo = "Civic";
        meuCarro.anoFabricacao = 2022;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.proprietario = new Pessoa();
        meuCarro.proprietario.nome = "Breno";
        meuCarro.proprietario.cpf = "xxx.xxx.xxx-xx";
        meuCarro.proprietario.anoNascimento = 2004;
        meuCarro.precoCompra = 120000.0;


      /*  Carro seuCarro = new Carro(); // a varivael faz referência ao objeto, mas ela não é o obejto
        seuCarro.modelo = "X6";
        seuCarro.fabricante = "BMW";
        seuCarro.cor = "Azul";
        seuCarro.anoFabricacao = 2023;*/

        System.out.println("Meu carro");
        System.out.println("--------------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);

        System.out.println(meuCarro.calcularValorRevenda());
        meuCarro.calcularValorRevenda();

//        System.out.println();
//        System.out.println("Seu carro");
//        System.out.println("--------------");
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);

        sc.close();
    }
}