package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Goku";
        estudante.idade = 25;
        estudante.sexo = 'M';


        System.out.println("O nome do estudante é: " + estudante.nome);
        System.out.println("A idade do estudante é: " + estudante.idade);
        System.out.println("O sexo do estudante é: " + estudante.sexo);

        //Equals e hashcode

        /*EQUALS*/

        // ele é usado para comparar se um objeto é igual a objeto atual
        // Se nos formos usar o "==" inves do equals, ele vai comparar apenas o endereço de memória
        // Se formos usar o equals ele vai comprar o valor


    }
}
