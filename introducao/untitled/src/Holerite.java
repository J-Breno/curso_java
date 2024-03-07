public class Holerite {

    Funcionario funcionario;
    public Double valorHorasTrabalhadas;
    public Double valorHorasExtrasTrabalhadas;
    public Double valorAdicionalFilhos;

    public Double calcularValorTotal() {
        Double totalValorHoras = valorHorasExtrasTrabalhadas + valorHorasTrabalhadas;
        return totalValorHoras;
    }

    public void imprimir() {
        System.out.printf("O valor total em horas são: %.2f%n", calcularValorTotal());
    }
}
