public class Main {
    public static void main(String[] args) {
        String nome1 = "João";
        String nome2 = "João";
        String nome3 = new String("João");

        System.out.println(nome1 == nome2);
        System.out.println(nome1 == nome3); // está comparando a referência
        System.out.println(nome1.equals(nome3)); // está comparando o conteúdo da variável

    }
}