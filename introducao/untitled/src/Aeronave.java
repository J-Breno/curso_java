public class Aeronave {

    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    public int calcularAssentosDisponiveis() {
        return totalAssentos - assentosReservados;
    }

    public void reservarAssentos(final int numeroAssentos) {
        if(ativo) {
            assentosReservados += numeroAssentos;
        } else {
            System.out.println("Aeronave desativada. Assentos não retornada");
        }
    }

    public void desativar() {
        ativo  = false;
    }

    public void ativar() {
        ativo  = true;
    }
}
