public class Program {
    public static void main(String[] args) {
        Integer numeroInt = 10;
        Double numeroDecimal = 10.5;
        Boolean sentencaObj = true;
        String  nome = "Nome";
        Long numeroGrande = 1234567899876124321L;
        Byte numeroPequeno = 1;
        Character genero = 'M';
        Cliente cliente = new Cliente();
        cliente.idade = 12;
        cliente.idade = Integer.valueOf("123");
        System.out.println(cliente.idade);

        Integer numero1 = 128;
        Integer numero2 = 128;

        System.out.println(numero1.equals(numero2));
    }
}
