public class NumeroUtil {

    public static int maiorNumero(final int numero1, final int numero2) {
       int maiorNumero = 0;
        if(numero1 > numero2 ) {
            maiorNumero = numero1;
        } else  {
            maiorNumero = numero2;
        }

        return maiorNumero;
    }

    public static int maiorNumero(final int numero1, final int numero2,final int numero3) {
        int maiorNumero = 0;
        if(numero1 > numero2 && numero1 > numero3) {
            maiorNumero = numero1;
        } else if(numero2 > numero3) {
            maiorNumero = numero2;
        } else {
            maiorNumero = numero3;
        }
        return maiorNumero;
    }

    public static double maiorNumero(final double numero1, final double numero2, final double numero3) {
        double maiorNumero = 0.0;
        if(numero1 > numero2 && numero1 > numero3) {
            maiorNumero = numero1;
        } else if(numero2 > numero3) {
            maiorNumero = numero2;
        } else {
            maiorNumero = numero3;
        }
        return maiorNumero;
    }

    public static double maiorNumero(final double numero1, final double numero2) {
        double maiorNumero = 0.0;
        if(numero1 > numero2) {
            maiorNumero = numero1;
        } else  {
            maiorNumero = numero2;
        }
        return maiorNumero;
    }
}
