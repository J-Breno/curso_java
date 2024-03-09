public class Calendario {
    static Meses mes = new Meses();

    static String obterNomeMes(int indice) {return mes.nome[indice - 1];}
}