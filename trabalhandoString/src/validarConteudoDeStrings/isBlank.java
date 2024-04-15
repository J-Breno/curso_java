package validarConteudoDeStrings;

public class isBlank {
    public static void main(String[] args) {
        String nome1 = "       ";

        System.out.println("é vazio?(usando o empty) " + nome1.isEmpty());
        System.out.println("está vazio?(usando o blank)" + nome1.isBlank());// verifica se não tem caractere também
        // se tiver alguma coisa diferente de vazio ou espaço em branco o isBlank vai retornar false
    }
}
