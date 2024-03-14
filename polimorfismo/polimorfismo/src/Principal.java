import com.github.JBreno.banco.*;
import com.github.JBreno.fiscal.GestorFiscal;
import com.github.JBreno.fiscal.NotaFiscal;
import com.github.JBreno.fiscal.NotaFiscalProduto;
import com.github.JBreno.fiscal.NotaFiscalServico;

import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var gestorFiscal = new GestorFiscal();
        var nf = new NotaFiscal("Agc", 500);
        var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo do motor", 900, true);

       gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);
    }
}