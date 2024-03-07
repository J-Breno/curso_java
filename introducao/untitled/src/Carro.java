public class Carro { //criando a estrutura/tipo/classe Carro

    public String fabricante;
    public String modelo;
    public String cor;
    public Integer anoFabricacao;
    public Pessoa proprietario; // o carro tem um proprietario, relação tem um
    // o carro tem um proprietario do tipo Pessoa
    public Double precoCompra;

    public void imprimirResumoDepreciacao() {
        Double valorRevendaMeuCarro = calcularValorRevenda();
        int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();

        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);
    }

    public  Double calcularIpva() {
        Integer tempoDeUsoEmanos = calcularTempoDeUsoEmAnos();
        if(tempoDeUsoEmanos >= 10) {
            return 0.0;
        }
        return calcularValorRevenda() * 0.04;
    }

    public Integer calcularTempoDeUsoEmAnos() {
        return 2022 * anoFabricacao;
    }

    public Double calcularValorRevenda() {
        Integer tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
        int vidaUtilEmAnos = 20;
        Double valorRevenda = (this.precoCompra / vidaUtilEmAnos) *
        (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if(valorRevenda < 0.0) {
            valorRevenda = 0.0;
        }
        return valorRevenda;
    }
}
