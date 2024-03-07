public class Funcionario {
    public String nome;
    public Integer quantidadeFilhos = 0;

    public void funcionarioTemFilhos() {
        if(quantidadeFilhos > 0) {
            System.out.println("Tem filhos!");
        } else {
            System.out.println("Não tem filhos!");
        }
    }
}
