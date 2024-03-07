public class IndiceMassaCorporal {
    public Double resultado;
    public Double peso;
    public Double altura;

    public boolean estaComObesidade() {
        return resultado >= 30;
    }

    public boolean estaAbaixoDoPesoIdal() {
        return resultado <= 18.5;
    }
}
