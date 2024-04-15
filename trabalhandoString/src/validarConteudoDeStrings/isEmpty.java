package validarConteudoDeStrings;

public class isEmpty {
    public static void main(String[] args) {
        String nome1 = "";
        String nome2 = "oi";
        System.out.println(nome1.length() == 0);
        System.out.println("--------");
        System.out.println(nome1.isEmpty());
        System.out.println(nome2.isEmpty());
    }
}
