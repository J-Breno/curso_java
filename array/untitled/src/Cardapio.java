import java.util.Objects;

public class Cardapio {
    ItemCardapio[] itens = new ItemCardapio[3];
    int count = 0;
    void adicionarItem(ItemCardapio item) {
        itens[count] = item;
        count++;
    }
    void removerItem(int indice) {
        itens[indice] = null;
    }
    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        Objects.requireNonNull(precoMinimo, "Deu ruim");

        if(precoMinimo < 0) {
            throw new IllegalArgumentException("Não pode menor do que 0");
        }
        for (ItemCardapio iten : itens) {
            if(iten != null) {
                if(iten.preco >= precoMinimo && iten.preco <= precoMaximo) {
                    System.out.println(iten.descricao + " - " + iten.preco);
                }
            }
        }
    }
}
