import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Maria";
        turmaB.alunos = new Aluno[3];

        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].idade = 19;
        turmaB.alunos[0].nome = "João";

        Aluno aluno2  = new Aluno();
        aluno2.nome = "Julia";
        aluno2.idade = 18;

        turmaB.alunos[1] = aluno2;
        turmaB.imprimirListaDeAlunos();
    }
}
