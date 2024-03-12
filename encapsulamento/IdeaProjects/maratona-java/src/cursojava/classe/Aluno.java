package cursojava.classe;

import java.util.Objects;

public class Aluno {
    /*Esses são os atributos do aluno, suas caracteristicas */
    public String nome;
    public int idade;
    public String dataNascimento;
    String registroGeral;
    String numeroCpf;
    String nomeMae;
    String nomePai;
    String dataMatricula;
    String nomeEscola;
    String serieMatriculado;

    private Disciplina disciplina = new Disciplina();

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public Aluno(){

    }
    public Aluno(String nomePadrao){
        nome = nomePadrao;
    }
    public Aluno(String nomePadrao, int idadePadrao){
        nome = nomePadrao;
        idade = idadePadrao;
    }

    /*Veremos os métodos Setters e Getters do objeto*/
    //Set/ Setters é para adicionar/receber os dados para os atributos
    //Get/getters é para resgatar/obter/retornar, para nos obtermos o valor, ele pega uma informação
    // Métodos getters conseguem acessar determiados atributos, mas mantendos a segurança deles
    /*
    Setters modificam coisas que estão dentro do objeto, mantendo a segurança

    */
    //Set - recebe os dados





    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public String getDataNascimento(){
        return this.dataNascimento;
    }

    public void setRegistroGeral(String registroGeral){
        this.registroGeral = registroGeral;
    }

    public String getRegistroGeral(){
        return this.registroGeral;
    }

    public void setNumeroCpf(String numeroCpf){
        this.numeroCpf = numeroCpf;
    }

    public String getNumeroCpf(){
        return this.numeroCpf;
    }

    public void setNomeMae(String nomeMae){
        this.nomeMae = nomeMae;
    }

    public String getNomeMae(){
        return this.nomeMae;
    }

    public void setNomePai(String nomePai){
        this.nomePai = nomePai;
    }
    public String getNomePai(){
        return this.nomePai;
    }

    public void setDataMatricula(String dataNascimento){
        this.dataMatricula = dataMatricula;
    }

    public String getDataMatricula(){
        return this.dataMatricula;
    }

    public void setNomeEscola(String nomeEscola){
        this.nomeEscola = nomeEscola;
    }

    public String getNomeEscola(){
        return this.nomeEscola;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public String getSerieMatriculado() {
        return this.serieMatriculado;
    }



    //Método que retorna a média do aluno
    public double getMediaNota(){
        return (disciplina.getNota1() +
                disciplina.getNota2() +
                disciplina.getNota3() +
                disciplina.getNota4()) / 4;
    }
    //Método que retorna true para aprovado e false para reprovado
    public boolean getAlunoAprovado(){
        double media = this.getMediaNota(); // this serve para chamar métodos ou caracteristicas
        if (media >= 70){
            return true;
        }else{
            return false;
        }

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(numeroCpf, aluno.numeroCpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroCpf);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", disciplina=" + disciplina +
                '}';
    }
}
