public class Calculadora {

    static double calcularMedia(int[] numeros) {
        double total = 0;
        for(int numero : numeros) {
            total+= numero;
        }
        return total / numeros.length;
    }



}
