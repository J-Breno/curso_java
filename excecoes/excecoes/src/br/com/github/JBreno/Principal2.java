package br.com.github.JBreno;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal2 {
    public static void main(String[] args) throws IOException {
        Path arquivo = Path.of("C:\\cursos/javaAvancado/excecoes/excecoes/src/br/com/github/JBreno/teste.txt");
        BufferedReader reader = null;

        try {
            reader = Files.newBufferedReader(arquivo);
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
            throw e;
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Erro fechando o leitor do arquivo: " + e.getMessage());
            }
        }
    }
}
