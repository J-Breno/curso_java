import java.util.Locale;
import java.util.Scanner;

public class Principio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        FolhaPagamento pagamento = new FolhaPagamento();

        System.out.print("Digite o nome do funcionario: ");
        Funcionario funcionario = new Funcionario();
        funcionario.nome = sc.nextLine();
        System.out.print("Digite as horas trabalhadas: ");
        pagamento.horasTrabalhadas = sc.nextInt();
        System.out.print("Digite o valor das horas trabalhadas: ");
        pagamento.holerite.valorHorasTrabalhadas = sc.nextDouble();
        System.out.print("Digite as horas extras trabalhadas: ");
        pagamento.horasExtrasTrabalhadas = sc.nextInt();
        System.out.print("Digite o valor das horas extra trabalhadas: ");
        pagamento.holerite.valorHorasExtrasTrabalhadas = sc.nextDouble();

        System.out.println();
        System.out.println("O valor total é: " + pagamento.calcularSalario(funcionario));
    }
}
