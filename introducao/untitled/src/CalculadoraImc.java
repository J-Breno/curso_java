public class CalculadoraImc {

    public IndiceMassaCorporal calcular(final Paciente paciente) {
        Double imcCalculado = paciente.peso / (paciente.altura * paciente.altura);

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = imcCalculado;
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;

        return imc;
    }
}
