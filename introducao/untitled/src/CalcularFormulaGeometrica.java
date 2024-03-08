public class CalcularFormulaGeometrica {

    static final public double PI = 3.14159265358979323846;
    public static double base;
    public static double altura;


    public static double areaDoQuadrado(){
        return base * altura;
    }

     public static double areaDoCirculo() {
        double area = base * altura;
        return area * CalcularFormulaGeometrica.PI;
    }
}
