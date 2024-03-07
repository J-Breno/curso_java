public class ContratoTrabalho {

    Funcionario funcionario;
    public Double valorHorasTrabalhadas;
    public Double valorHorasExtrasTrabalhadas;

    public void funcionarioTemFilhos() {
        if(funcionario.quantidadeFilhos > 0) {
            System.out.println("Tem filhos!");
        } else {
            System.out.println("Não tem filhos!");
        }
    }

}
