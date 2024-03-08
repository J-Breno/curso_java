public class FolhaPagamento {

    public Integer horasTrabalhadas;
    public Integer horasExtrasTrabalhadas;

    Holerite holerite = new Holerite();

    public Double calcularSalario(final Funcionario funcionario) {
        Integer horas = horasTrabalhadas + horasExtrasTrabalhadas;
        Double valorTotal = holerite.calcularValorTotal() + horas;
        if(funcionario.quantidadeFilhos >= 1 ) {
            valorTotal += (valorTotal * 0.10);
        }
        return valorTotal;
    }
}
