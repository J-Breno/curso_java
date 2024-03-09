import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[]{8, 5, 4, 9, 10};
//        int[] notas;
//        notas = new int[1];
//        int [] notas = new int[2]; OBJETO ARRAY DE INTEIROS

//        int[] arr = new int[]{2, 6, 3,1};
//        for (int i = 0; i < 4; i++) {
//            System.out.printf("posicao %d no array: %d%n", i+1 , arr[i]);
//        }
//
//        System.out.println();
//        System.out.println("------------------");
//        for (int i : arr) {
//            System.out.println(i);
//        }

        int[] notas = {8, 5, 7, 10};

        System.out.println("Media das notas: " + Calculadora.calcularMedia(notas));
        System.out.println(Arrays.toString(notas));
        Integer[] arr = {4,2,0,5,9,11,34,22};
        for (int a : arr) {
            System.out.println(a);
        }
        Arrays.sort(arr);
        for (int a : arr) {
            System.out.println(a);
        }

        Arrays.sort(arr, Comparator.reverseOrder());
        for (int a : arr) {
            System.out.println(a);
        }
    }
}