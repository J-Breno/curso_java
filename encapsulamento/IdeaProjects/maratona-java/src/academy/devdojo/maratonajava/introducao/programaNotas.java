package academy.devdojo.maratonajava.introducao;

import com.sun.nio.sctp.AbstractNotificationHandler;

import javax.swing.*;

public class programaNotas {
    public static void main(String[] args) {
        String nota1 = JOptionPane.showInputDialog("Informe a nota 1: ");
        String nota2 = JOptionPane.showInputDialog("Informe a nota 2: ");
        String nota3 = JOptionPane.showInputDialog("Informe a nota 3: ");
        String nota4 = JOptionPane.showInputDialog("Informe a nota 4: ");

        double dNota1 = Double.parseDouble(nota1);
        double dNota2 = Double.parseDouble(nota2);
        double dNota3 = Double.parseDouble(nota3);
        double dNota4 = Double.parseDouble(nota4);

        double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

        if(media >= 5){
            if(media >= 7){
                JOptionPane.showMessageDialog(null, "Aluno está aprovado com uma média de: " + media);
            }else{
                JOptionPane.showMessageDialog(null,"Aluno está de recuperação com uma média de: " + media);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Aluno esta reprovado com uma média de: " + media);
        }

    }
}
