package cursojava.executavel;

import cursojava.classe.Aluno;

import javax.swing.*;

public class primeiraClasseJava {
    public static void main(String[] args) {
        /*new Aluno() é uma instância = criar um objeto*/
        /*O aluno1 é uma variável que faz uma referência para o objeto Aluno()*/
        Aluno aluno1 = new Aluno();

        String nome = JOptionPane.showInputDialog("Qual o nome do Aluno? ");
        String idade = JOptionPane.showInputDialog("Qual a idade do Aluno? ");
        String dataNascimento = JOptionPane.showInputDialog("Qual a data de Nascimento do Aluno?");
        String rg = JOptionPane.showInputDialog("Qual o Rg do Aluno?");
        String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno? ");
        String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno? ");
        String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno? ");
        String dataMatricula = JOptionPane.showInputDialog("Qual foi a data de matricula do aluno? ");
        String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno? ");
        String serie = JOptionPane.showInputDialog("Qual a série do aluno? ");

        String disciplina1 = JOptionPane.showInputDialog("Qual é disciplina1? ");
        String n1 = JOptionPane.showInputDialog("Qual a nota 1 do aluno? ");

        String disciplina2 = JOptionPane.showInputDialog("Qual a disciplina2? ");
        String n2 = JOptionPane.showInputDialog("Qual a nota 2 do aluno? ");

        String disciplina3 = JOptionPane.showInputDialog("Qual a disciplina3? ");
        String n3 = JOptionPane.showInputDialog("Qual a nota 3 do aluno? ");

        String disciplina4 = JOptionPane.showInputDialog("Qual a disciplina4? ");
        String n4 = JOptionPane.showInputDialog("Qual a nota 4 do aluno? ");

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setNomeEscola(nomeEscola);
        aluno1.setSerieMatriculado(serie);

        aluno1.getDisciplina().setNota1(Double.parseDouble(n1));
        aluno1.getDisciplina().setNota2(Double.parseDouble(n2));
        aluno1.getDisciplina().setNota3(Double.parseDouble(n3));
        aluno1.getDisciplina().setNota4(Double.parseDouble(n4));

        aluno1.getDisciplina().setDisciplina1(disciplina1);
        aluno1.getDisciplina().setDisciplina2(disciplina2);
        aluno1.getDisciplina().setDisciplina3(disciplina3);
        aluno1.getDisciplina().setDisciplina4(disciplina4);


       System.out.println(aluno1.toString());//Descrição do objeto na memóri
       System.out.println("Média do aluno = " + aluno1.getMediaNota());
       System.out.println("Resultado = " + aluno1.getAlunoAprovado());


    }
}
