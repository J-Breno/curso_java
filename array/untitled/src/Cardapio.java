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

        for (ItemCardapio iten : itens) {
            if(iten != null) {
                if(iten.preco >= precoMinimo && iten.preco <= precoMaximo) {
                    System.out.println(iten.descricao + " - " + iten.preco);
                }
            }
        }
    }
}
